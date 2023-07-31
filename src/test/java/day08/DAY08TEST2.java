package day08;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import day08.Pratice.DepartmentEmployees;

public class DAY08TEST2 {
	
	@Test
	void test() {
		
		
		Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.trim();
        String[] records = input.split(",");
 
        HashMap<String, List<String>> departmentEmployeesMap = new HashMap<>();

        for (int i = 0; i < records.length; i += 2) {
        	String  department = records[i].trim();
        	String  employee = records[i + 1].trim();

            if (departmentEmployeesMap.containsKey(department)) {
                List<String> employees = departmentEmployeesMap.get(department);
                employees.add(employee);
            } else {
                List<String> employees = new ArrayList<>();
                employees.add(employee);
                departmentEmployeesMap.put(department, employees);
            }
        }

        
        departmentEmployeesMap.forEach((key , value)->System.out.println(key + " = " + String.join("," , value)));

    }
		
		
		
	}
	
	
	


