package day09.Solved;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortingDemo {
	
	public static void main(String[] args) {
		ArrayList<String> cityNames = new ArrayList<String>();
		cityNames.add("Delhi");
		cityNames.add("Chennai");
		cityNames.add("Bangalore");
		cityNames.add("Trivandram");
		cityNames.add("patana");
		

		System.out.println("Before Sort:" + cityNames);
		Collections.sort(cityNames);
		System.out.println("After Sort:" + cityNames);
	}

}
