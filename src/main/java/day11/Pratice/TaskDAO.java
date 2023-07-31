package day11.Pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TaskDAO {
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/project";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "123456";

    public void createTask(Task task) throws DAOException {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String insertQuery = "INSERT INTO task_table (id, name, status) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                preparedStatement.setInt(1, task.id);
                preparedStatement.setString(2, task.name);
                preparedStatement.setString(3, task.status);

                // Execute the insert statement
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            // Rethrow the SQLException as a custom DAOException
            throw new DAOException("Error creating task", e);
        }
    }
	

}
