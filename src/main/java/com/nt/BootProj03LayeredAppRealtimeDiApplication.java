package com.nt;


import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.nt.controller.PayRollOprationControler;
import com.nt.model.Employee;



@SpringBootApplication
public class BootProj03LayeredAppRealtimeDiApplication {



	public static void main(String[] args) {
		//read input data from user
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee Name::");
		 String name=sc.next();
		 System.out.println("Enter Employee desg::");
		 String desg=sc.next();
		 System.out.println("Enter Employe basic salary::");
		 double basicSalary= sc.nextDouble();
		 //creat employe obj 
		 
		 Employee emp= new Employee();
		 emp.setDesg(desg);
		 emp.setEname(name);
		 emp.setSalary(basicSalary);
		 
		
		///get ioc container
	ApplicationContext ctx=	SpringApplication.run(BootProj03LayeredAppRealtimeDiApplication.class, args);
	//get target spring bean obj ref
	
	PayRollOprationControler payroll=ctx.getBean("Payroll",PayRollOprationControler.class);
	// invoke the method
	
	try {  String result= payroll.ProcessEmployee(emp);
		
		System.out.println(result);
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("enternel problem try again"+e.getMessage());
	}
	//close the container
	
	((ConfigurableApplicationContext)ctx).close();
	
	
	}

}
