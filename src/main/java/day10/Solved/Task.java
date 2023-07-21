package day10.Solved;

public class Task {
	
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class TaskValidator {
	public static boolean validate(Task task) throws ValidationException {
		if (task == null)
			throw new ValidationException("Task is null");
		else if (task.getName() == null || "".equals(task.getName()))
			throw new ValidationException("Task name is empty");
			return true;
	}
}

public class UsingCustomExceptionsDemo {
	public static void main(String[] args) {
		Task task = new Task();
//		task.setName("Creating test case"); Commenting this so that exception is thrown
		
		try {
			TaskValidator.validate(task);
		} catch (ValidationException e) {
			e.printStackTrace();
		}
	}

}
