package com.test.sb.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.sb.model.Employee;

@Repository
public class EmployeeDao {

	public List<Employee> list = new ArrayList<Employee>();
	
	public EmployeeDao() {
		list.add(new Employee(1,"SaiBaba"));
		list.add(new Employee(2,"Balaji"));
	}

	public List<Employee> getEmps() {
		return list;
	}
	
	public String addEmp(Employee emp) {
		list.add(emp);
		return "Employee details added successfully.";
	}
	
	public String editEmp(Employee emp) {
		System.out.println("Before update :"+list);
		list.stream().filter(e1 -> e1.getEmpNo()== emp.getEmpNo()).forEach(e2 -> {
			e2.setEmpName(emp.getEmpName());
			System.out.println("After update :"+list);
		});
		return "Employee details updated successfully.";
	}
	public String deleteEmp(int empNo) {
		list.remove(empNo-1);
		return "Employee details deleted successfully.";
	}
	
}
