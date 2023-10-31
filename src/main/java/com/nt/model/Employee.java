package com.nt.model;

import lombok.Data;

@Data
public class Employee {
	
	private Integer empno;
	private String ename;
	private String desg;
	
	private double salary;
	private double grosssalary;
	private double netsalary;
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getGrosssalary() {
		return grosssalary;
	}
	public void setGrosssalary(double grosssalary) {
		this.grosssalary = grosssalary;
	}
	public double getNetsalary() {
		return netsalary;
	}
	public void setNetsalary(double netsalary) {
		this.netsalary = netsalary;
	}





}
