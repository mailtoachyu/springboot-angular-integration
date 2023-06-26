package com.springbootangular;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("getAllEmployee")
	public List<EmployeeDto> getAllEmployee() {
		List<EmployeeDto> list = new ArrayList<EmployeeDto>();
		list.add(new EmployeeDto("Ram","Software"));
		list.add(new EmployeeDto("Sam","Accountant"));
		return list;
	}

}
