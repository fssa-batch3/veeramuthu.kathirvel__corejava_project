package day12.Solved;

import day11.Solved.ReusableTestConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserQuery {
	
public static void main(String[] args) throws Exception {       
         
        
        Connection connection = ConnectionUtil.getConnection();
        System.out.println(connection);
         
        Statement stmt = connection.createStatement();
         
     
        String query ="INSERT INTO USERS (user_name, email_id, password) VALUES (\"vinit_gore\",\"vinit.gore@ctr.freshworks.com\", \"password007\")";
        int rows = stmt.executeUpdate(query);
        System.out.println("No of rows inserted :" + rows );
         
        
        final String selectQuery = "SELECT user_id,user_name,email_id FROM USERS";
         
        
        ResultSet rs = stmt.executeQuery(selectQuery);
         
       
        while ( rs.next()) {
        	int userId = rs.getInt("user_id");            
        	String userName = rs.getString("user_name");
            String emailID = rs.getString("email_id");
             
            System.out.println("UserId:" + userId +", UserName:" + userName + ", EMAIL ID:" + emailID);
        }
         
              
        rs.close();
        stmt.close();
        connection.close();
         
         
         
    }

}
