package day10.Pratice;

import java.util.ArrayList;


class User {
    int id;
    String name;
    String emailId;

    public User(int id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }
}

class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

class UserManager {
    private ArrayList<User> userList;

    public UserManager() {
        userList = new ArrayList<>();
    }

    public void register(User user) throws UserAlreadyExistsException {
        for (User existingUser : userList) {
            if (existingUser.emailId.equals(user.emailId)) {
                throw new UserAlreadyExistsException("User with email " + user.emailId + " already exists.");
            }
        }
        userList.add(user);
    }

    public int getUserCount() {
        return userList.size();
    }
}

public class ArrayException {
	
	
	
	public static void main(String[] args) {
        ArrayException app = new ArrayException();
        app.registerUsers();
    }

    public void registerUsers() {
        UserManager userManager = new UserManager();

        try {
            User user1 = new User(1, "Jayaprakash", "jayaprakash@gmail.com");
            userManager.register(user1);
            System.out.println("User registered: " + user1.name);

            User user2 = new User(2, "Aimal", "ajmal@gmail.com");
            userManager.register(user2);
            System.out.println("User registered: " + user2.name);

            User duplicateUser = new User(3, "Jayaprakash", "jayaprakash@gmail.com");
            userManager.register(duplicateUser);
            System.out.println("User registered: " + duplicateUser.name);
        } catch (UserAlreadyExistsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
