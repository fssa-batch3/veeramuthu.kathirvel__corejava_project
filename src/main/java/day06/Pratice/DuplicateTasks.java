
package day06.Pratice;


import java.util.ArrayList;
import java.util.List;

public class DuplicateTasks {
	
	

	public static void main(String[] args) {

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
