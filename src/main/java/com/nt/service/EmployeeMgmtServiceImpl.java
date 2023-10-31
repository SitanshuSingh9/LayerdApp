/package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.daao.IEmployeeDAO;
import com.nt.model.Employee;
@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeemgmtService {
    @Autowired
	private IEmployeeDAO empDAO;
	@Override
	public String RegisterEmployee(Employee emp) throws Exception {
 //calculet grosssalary or net salary
		double grosssalary=emp.getSalary()+(emp.getSalary()*0.4f);
		double netsalary=grosssalary-(emp.getGrosssalary()*0.2f);
		//setgrosssalary and net salary
		emp.setGrosssalary(grosssalary);
		emp.setNetsalary(netsalary);
		//use Dao
		
		int count=empDAO.insert(emp);
		

		return count==0?"Employeee regestration faild":"Employe registration succesful and the salary=="+emp.getSalary()+"gross salary="
		+emp.getGrosssalary()+"Netsalary"+emp.getNetsalary();
	}

}
