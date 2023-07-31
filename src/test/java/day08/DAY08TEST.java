package day08;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import day08.Pratice.CountingName;

public class DAY08TEST {
	
	@Test
	void test() {
		
		
		Scanner scan = new Scanner(System.in);
		  
		System.out.print("Enter the Input as CSV : ");
		
		String csv = scan.nextLine().trim();
		
		String[] names = csv.split(",");
		
		HashMap<String , Integer> hash = new HashMap<>();
		
		for(String name : names) {
			if(!hash.containsKey(name.trim())) {
				hash.put(name.trim(),1);
			}else {
				int count = hash.get(name.trim());
				hash.replace(name.trim(), count+1);
			}
			
		}
		
		hash.forEach((key,value) -> System.out.println(key + " = " + value));
		
	}	
		
	}


