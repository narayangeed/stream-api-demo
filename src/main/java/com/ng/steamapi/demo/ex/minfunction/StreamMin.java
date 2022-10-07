package com.ng.steamapi.demo.ex.minfunction;

import java.util.Comparator;
import java.util.List;

import com.ng.steamapi.demo.model.Employee;
import com.ng.steamapi.demo.util.DataGenerator;

public class StreamMin {
	
	public static void main(String[] args) {
		List<Employee> employeeData = DataGenerator.generateData();
		
		System.out.println("Min Salary");
		employeeData.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
	
		System.out.println("Max Rating");
		employeeData.stream().min(Comparator.comparing(Employee::getRating)).ifPresent(System.out::println);
		
	}

}
