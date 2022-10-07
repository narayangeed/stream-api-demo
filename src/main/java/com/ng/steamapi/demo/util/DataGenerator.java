package com.ng.steamapi.demo.util;

import java.util.ArrayList;
import java.util.List;

import com.ng.steamapi.demo.model.Address;
import com.ng.steamapi.demo.model.Department;
import com.ng.steamapi.demo.model.Employee;

public class DataGenerator {

	public static List<Employee> generateData() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Remo", "M", 20000L, 5, new Address("Pune", "MH", "000000", "India"),
				new Department("IT", "001")));
		empList.add(new Employee(2, "Mohan", "M", 30000L, 3, new Address("Pune", "MH", "000000", "India"),
				new Department("Administration", "001")));
		empList.add(new Employee(3, "Shreya", "F", 20000L, 2, new Address("Pune", "MH", "000000", "India"),
				new Department("Security", "001")));
		empList.add(new Employee(4, "Shyam", "M", 10000L, 1, new Address("Pune", "MH", "000000", "India"),
				new Department("Lib", "001")));
		empList.add(new Employee(5, "Savitri", "F", 40000L, 8, new Address("Pune", "MH", "000000", "India"),
				new Department("System", "001")));
		empList.add(new Employee(6, "Bhide", "M", 50000L, 4, new Address("Pune", "MH", "000000", "India"),
				new Department("Administration", "001")));
		empList.add(new Employee(7, "Popatlal", "M", 20000L, 6, new Address("Pune", "MH", "000000", "India"),
				new Department("IT", "001")));
		empList.add(new Employee(8, "Neelima", "F", 30000L, 9, new Address("Pune", "MH", "000000", "India"),
				new Department("IT", "001")));
		empList.add(new Employee(9, "Sodi", "M", 50000L, 2, new Address("Pune", "MH", "000000", "India"),
				new Department("System", "001")));
		empList.add(new Employee(10, "Hemlata", "F", 30000L, 0, new Address("Pune", "MH", "000000", "India"),
				new Department("Administration", "001")));
		return empList;
	}

}
