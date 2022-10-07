package com.ng.steamapi.demo.ex.sortingmethod;

import java.util.Comparator;
import java.util.List;

import com.ng.steamapi.demo.model.Employee;
import com.ng.steamapi.demo.util.DataGenerator;

public class StreamSorting {

	public static void main(String[] args) {

		List<Employee> employeeData = DataGenerator.generateData();
		
		System.out.println("In natural order");
		// Sorting by Salary
		employeeData.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(l -> System.out.println(l));

		System.out.println("-------------------------------------");
		System.out.println("In desc order");
		// Sorting by Salary desc
		employeeData.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.forEach(l -> System.out.println(l));
		
		System.out.println("-------------------------------------");
		System.out.println("Sort by rating and salary");
		// Sorting by Salary desc
		employeeData.stream()		
		.sorted(Comparator.comparing(Employee::getSalary))
		.sorted(Comparator.comparing(Employee::getRating))
				.forEach(l -> System.out.println(l));

	}

}
