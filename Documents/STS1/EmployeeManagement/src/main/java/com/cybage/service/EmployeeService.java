package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cybage.model.Employee;

@Service    //framework create object
public class EmployeeService {

	List<Employee> employeeList=new ArrayList<Employee>();
	
	public EmployeeService()
	{
		employeeList.add(new Employee(101,"sara","manager",80000));
		employeeList.add(new Employee(102,"sneha","devloper",70000));
		employeeList.add(new Employee(103,"deepali","eng",50000));
		employeeList.add(new Employee(104,"supriya","eng",60000));
		
		
		
	}
	
	public List<Employee> getEmployees(){
		return employeeList;
	}
	
	
}
