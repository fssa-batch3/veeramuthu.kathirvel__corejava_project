package day12.Pratice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



class Task {
    int id;
    String name;
    String status;
}

class DAOException extends Exception {
    // User-defined exception to wrap SQLException
    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class TaskDAO {
	
	
	private final String url = "jdbc:mysql://localhost/project";
    private final String username = "root";
    private final String password = "123456";

    public void createTask(Task task) throws DAOException {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String insertQuery = "INSERT INTO task (id, name, status) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
                pstmt.setInt(1, task.id);
                pstmt.setString(2, task.name);
                pstmt.setString(3, task.status);
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            throw new DAOException("Error creating task", e);
        }
    }

    public void updateTask(Task task) throws DAOException {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String updateQuery = "UPDATE task SET name = ?, status = ? WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
                pstmt.setString(1, task.name);
                pstmt.setString(2, task.status);
                pstmt.setInt(3, task.id);
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            throw new DAOException("Error updating task", e);
        }
    }

    public void deleteTask(int taskId) throws DAOException {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String deleteQuery = "DELETE FROM task WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(deleteQuery)) {
                pstmt.setInt(1, taskId);
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            throw new DAOException("Error deleting task", e);
        }
    }

    public List<Task> getAllTasks() throws DAOException {
        List<Task> tasks = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String selectQuery = "SELECT id, name, status FROM task";
            try (Statement stmt = conn.createStatement()) {
                ResultSet rs = stmt.executeQuery(selectQuery);
                while (rs.next()) {
                    Task task = new Task();
                    task.id = rs.getInt("id");
                    task.name = rs.getString("name");
                    task.status = rs.getString("status");
                    tasks.add(task);
                }
            }
        } catch (SQLException e) {
            throw new DAOException("Error getting tasks", e);
        }
        return tasks;
    }

}
