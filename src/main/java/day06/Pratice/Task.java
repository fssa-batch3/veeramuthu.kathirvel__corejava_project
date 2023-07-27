package day06.Pratice;


import java.util.ArrayList;

public class Task {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task: " + name + ", Priority: " + priority;
    }

    public static void main(String[] args) {
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
