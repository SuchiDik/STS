package com.cybage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {

	@RequestMapping("/hello")

	public ResponseEntity<String> sayHello()
	{
		return new ResponseEntity<>("Hello spring 4 rest",HttpStatus.OK);
	}
	
	@RequestMapping("/data")

	public ResponseEntity<List<String> >listData()
	{
		List<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("banana");
		list.add("guava");
		return new ResponseEntity(list,HttpStatus.CREATED);
	}
	
	
}
