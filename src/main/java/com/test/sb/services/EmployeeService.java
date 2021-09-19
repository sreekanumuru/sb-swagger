package com.test.sb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sb.dao.EmployeeDao;
import com.test.sb.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	public List<Employee> getEmps() {
		return dao.getEmps();
	}
	
	public String addEmp(Employee emp) {
		return dao.addEmp(emp);
	}
	public String editEmp(Employee emp) {
		return dao.editEmp(emp);
	}
	public String deleteEmp(int empNo) {
		return dao.deleteEmp(empNo);
	}
	
}

