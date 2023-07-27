package day06;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import day06.Pratice.DuplicateTasks;

public class DAY06TEST {
	
	
	@Test
	void test() {
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("Tamilnadu");
		cityList.add("kerala");
		cityList.add("karnataka");
		cityList.add("delhi");
		cityList.add("Tamilnadu");

		List<String> NewCityList = new ArrayList<String>();

		for (String city : cityList) {
			if (!NewCityList.contains(city)) {
				NewCityList.add(city);
			}
		}

		for (String city : NewCityList) {
			System.out.println(city);
		}
		
	}
	

}
