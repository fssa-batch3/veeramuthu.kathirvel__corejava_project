import java.util.ArrayList;




public class ArrayListWithGenericsDemo {
	
	public static void main(String[] args) {

		
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");

		
		for (String cityName : cityList) {
			System.out.println(cityName);
		}

		System.out.println(cityList);

	}

}
