package day09.Pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortIntegers {
	
	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter numbers: ");
	        ArrayList<Integer> numbers = new ArrayList<>();
	        while (scanner.hasNextInt()) {
	            numbers.add(scanner.nextInt());
	        }
	        

	       
	        Collections.sort(numbers);

	       
	        System.out.print("Sorted list: ");
	        for (Integer num : numbers) {
	            System.out.print(num + " ");
	        }

}
}
