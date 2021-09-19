package com.test.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.sb.model.Employee;
import com.test.sb.services.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.*;

@RestController
@RequestMapping("/emp")
@Api(value = "Employee details", description = "Employee details")
public class EmployeeDetailsController {

	@Autowired
	EmployeeService service;
	
	@ApiOperation(value = "It list the employees")
	@ApiResponses(value = {
			@ApiResponse(code = 100, message = "100 is the message"),
			@ApiResponse(code = 200, message = "Successful listing employees")
	})
	@GetMapping("/empList")
	public List<Employee> getEmps() {
		return service.getEmps();
	}
	
	@ApiOperation(value = "To add the employee")
	@PostMapping("/emp/add")
	public String addEmp(@RequestBody Employee emp) {
		return service.addEmp(emp);
	}
	
	@ApiOperation(value = "To edit the employee detail name")
	@PutMapping("/emp/edit")
	public String editEmp(@RequestBody Employee emp) {
		return service.editEmp(emp);
	}
	
	@ApiOperation(value = "To delete the employee details")
	@DeleteMapping("/emp/delete")
	public String  deleteEmp(@RequestParam int empNo) {
		return service.deleteEmp(empNo);
	}
}
