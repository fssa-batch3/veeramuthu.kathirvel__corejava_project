package day06;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import day06.Pratice.Task;

public class Day06CASE {
	
	
	@Test
	void test() {
		
		
		ArrayList<Task> taskList = new ArrayList<>();

        Task task1 = new Task("Complete React Assignment", 2);
        Task task2 = new Task("Go to ooty", 1);
        Task task3 = new Task("Enjoy", 3);

        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);

        
        for (Task task : taskList) {
            System.out.println(task);
        }	

}
}
