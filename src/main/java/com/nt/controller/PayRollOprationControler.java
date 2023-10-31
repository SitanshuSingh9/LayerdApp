package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeemgmtService;
@Controller("Payroll")
public class PayRollOprationControler {
	@Autowired
	private IEmployeemgmtService service;
	
	public String ProcessEmployee(Employee emp)throws Exception{
		
		//deliget the request to service class
		String result=service.RegisterEmployee(emp) ;
		return result;
	}

}
