package day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import day09.Pratice.SortingTheArrayusingCollection;


public class DAY09TEST {
	
	@Test
	void test() {
		
		Scanner scan = new Scanner(System.in);
		  int size = scan.nextInt();
		  ArrayList<Integer> sorted = new ArrayList<Integer>();
		  
		  
		  for(int i =0;i < size;i++)
			  sorted.add(scan.nextInt());
		  
		
		  System.out.println("Before : " + sorted);
		  Collections.sort(sorted);
		  System.out.println("After : " + sorted);
		  
	  }
		
	}


