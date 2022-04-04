package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.model.Employee;
import com.cybage.service.EmployeeService;

@Controller
public class EmployeeController {
	
	//@RequestMapping(value="getAllEmployees",method=RequestMethod.GET)
	
	@Autowired     //framework create object
	EmployeeService employeeService;
	
	@GetMapping("/getAllEmployees")
	public ModelAndView getAllEmployee()
	{
		List<Employee>employeeList=employeeService.getEmployees();
		return new ModelAndView("displayEmployee","empList","employeeList");
		
	}

}
