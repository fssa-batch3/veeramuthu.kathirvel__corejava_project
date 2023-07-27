package day09.Pratice;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class SortingTheArrayusingCollection {
	
	
	
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.parse("2023-04-20");
		LocalDate date2 = LocalDate.parse("2023-04-25");
		LocalDate date3 = LocalDate.parse("2023-12-10");

		Task task1 = new Task(3, "Reading", date1);
		Task task2 = new Task(2, "Brushing", date2);
		Task task3 = new Task(4, "Sleeping", date3);

		ArrayList<Task> arr = new ArrayList<>();
		arr.add(task1);
		arr.add(task2);
		arr.add(task3);

		Collections.sort(arr, new SortATaskByDate());

		for (Task t : arr) {
			System.out.println("Id:"+t.getId() + " " +"Task Name:"+ t.getName() + " " +"Deadline:"+ t.getDeadline());
		}

}
