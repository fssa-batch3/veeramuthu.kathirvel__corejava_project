package day10.Solved;

public class NewTaskValidator {
	
	
	public static boolean validate(Task task)  {
		if (task == null)
			throw new IllegalArgumentException("Task is null");
		else if (task.getName() == null || "".equals(task.getName()))
			throw new IllegalArgumentException("Task name is empty");
		return true;
	}
}

/**
 * Example for demonstrating Exception Hierarchy
 * showing how RuntimeExceptions are handled.
 */
public class ThrowRunTimeExceptionDemo {
	public static void main(String[] args) {
		Task task = new Task();
	//	task.setName("Creating test case"); // Commenting this so that exception is thrown
		// Not surrounding with try catch as Illegal is a runtime exception
		NewTaskValidator.validate(task);
	}

}
