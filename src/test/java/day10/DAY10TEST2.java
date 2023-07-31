package day10;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import day10.Pratice.ArrayException;

public class DAY10TEST2 {
	
	@Test
	void test() {
		
		UserManager userManager = new UserManager();

        User user1 = new User(1, "John", "john@example.com");
        User user2 = new User(2, "Alice", "alice@example.com");
        User user3 = new User(3, "Bob", "bob@example.com");

        try {
            userManager.register(user1);
            userManager.register(user2);
            userManager.register(user3);
            userManager.register(user2); // This will throw UserAlreadyExistsException
        } catch (UserAlreadyExistsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
		
	}


