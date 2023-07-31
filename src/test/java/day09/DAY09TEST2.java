package day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import day09.Pratice.SortIntegers;


public class DAY09TEST2 {
	
	@Test
	void test() {
		
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
