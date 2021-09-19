package com.test.sb.model;

import io.swagger.annotations.ApiModelProperty;

public class Employee {
	
	@ApiModelProperty(notes = "Employee Number")
	private int empNo;
	
	@ApiModelProperty(notes = "Employee Name")
	private String empName;
	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + "]";
	}
	
	
}
