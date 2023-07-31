package day09.Pratice;

import java.util.*;


public class SortingTheArrayusingCollection {
	
	public static void main(String[] args) {
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
