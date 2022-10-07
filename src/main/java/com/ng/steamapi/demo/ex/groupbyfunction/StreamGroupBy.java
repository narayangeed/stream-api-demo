package com.ng.steamapi.demo.ex.groupbyfunction;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ng.steamapi.demo.model.Employee;
import com.ng.steamapi.demo.util.DataGenerator;

public class StreamGroupBy {
	
	public static void main(String[] args) {
		List<Employee> employeeData = DataGenerator.generateData();
		
		System.out.println("Group by gender");
		Map<String, List<Employee>> groupByGender = employeeData.stream().collect(Collectors.groupingBy(Employee::getGender));
		System.out.println(groupByGender);
		
		System.out.println("Group by departments");
		Map<Object, List<Employee>> groupByDepartment = employeeData.stream().collect(Collectors.groupingBy(l -> l.getDepartments().getName()));
		System.out.println(groupByDepartment);
	}

}
