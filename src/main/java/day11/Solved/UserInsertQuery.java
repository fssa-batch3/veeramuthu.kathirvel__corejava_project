package day11.Solved;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserInsertQuery {
	
	
	
	public static void main(String[] args) throws Exception {       
        
        // Step 01: Get connection
        Connection connection = ConnectionUtil.getConnection();
        System.out.println(connection);

        // Step 02: Create a Statement
        Statement stmt = connection.createStatement();
         
        // Step 03: Execute Insert Query
        String query ="INSERT INTO user (username, password, dob, phone, email, first_name, last_name) VALUES (\"+geek_bhirahatees\",\"bhirahatees@123\",\"2005-04-25\",\"9150415595\",\"bhirahatees.periyasamy@fssa.freshworks.com\",\"Bhirahateesvaran\", \"Periyasamy\")";
        int rows = stmt.executeUpdate(query);
        System.out.println("No of rows inserted :" + rows );
         
         
        //Step 04: close the connection resources       
        ConnectionUtil.close(connection, stmt, null);
         
         
         
    }

}
