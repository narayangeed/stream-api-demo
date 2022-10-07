package com.ng.steamapi.demo.ex.maxfunction;

import java.util.Comparator;
import java.util.List;

import com.ng.steamapi.demo.model.Employee;
import com.ng.steamapi.demo.util.DataGenerator;

public class StreamMax {

	public static void main(String[] args) {
		List<Employee> employeeData = DataGenerator.generateData();
		
		System.out.println("Max Salary");
		employeeData.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
	
		System.out.println("Max Rating");
		employeeData.stream().max(Comparator.comparing(Employee::getRating)).ifPresent(System.out::println);
		
	}

}
