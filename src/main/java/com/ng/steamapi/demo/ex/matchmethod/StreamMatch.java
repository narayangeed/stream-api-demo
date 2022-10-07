package com.ng.steamapi.demo.ex.matchmethod;

import java.util.List;

import com.ng.steamapi.demo.model.Employee;
import com.ng.steamapi.demo.util.DataGenerator;

public class StreamMatch {

	public static void main(String[] args) {

		List<Employee> employeeData = DataGenerator.generateData();
		boolean allMatch = employeeData.stream().allMatch(l -> l.getSalary() > 2000);
		System.out.println(allMatch);

	}

}
