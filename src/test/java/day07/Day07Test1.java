package day07;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import day07.Pratice.RemoveDups;


public class Day07Test1 {
	
	@Test
	void test() {
		
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


