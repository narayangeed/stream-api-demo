package com.ng.steamapi.demo.ex.filtermethod;

import java.util.List;

import com.ng.steamapi.demo.model.Employee;
import com.ng.steamapi.demo.util.DataGenerator;

public class SteamFilter {

	public static void main(String[] args) {

		List<Employee> employeeData = DataGenerator.generateData();
		
		// Filter data using gender 
		employeeData.stream().filter(l -> "M".equals(l.getGender())).forEach(l -> System.out.println(l.toString()));

	}

}
