package com.ng.steamapi.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
	private Integer employeeId;
	private String name;
	private String gender;
	private Long salary;
	private int rating;
	private Address address;
	private Department departments;
}
