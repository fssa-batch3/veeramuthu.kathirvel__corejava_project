package day07.Pratice;

import java.util.*;

public class RemoveDups {
	
	public static HashSet<Integer> removeduplicates(ArrayList<Integer> nums){
		return new HashSet<Integer>(nums);
	}
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(1);
		nums.add(3);
		nums.add(1);
		nums.add(5);
		
		System.out.print(RemoveDups.removeduplicates(nums));
	
	}

}
