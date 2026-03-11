package com.javaFundamentals;
public class Employee{
	   String empName="king";
       Float monthlySal=27000F;
       
       
       Float pf=monthlySal*(5F/100);
      
       
       Float cgst=monthlySal*(7F/100);
       
       Float da=monthlySal*(3F/100);
      
	public static void main(String args[]) {
		Employee e=new Employee();
		System.out.println("EmployeeName   :    "+e.empName);
		System.out.println("PF deduction per month   : "+e.pf);
		System.out.println("CGST deduction per month : "+e.cgst);
		System.out.println("DA credits per month     : "+e.da);
		System.out.println("The net monthly Salary   :"+(e.monthlySal-e.pf-e.cgst+e.da));
		System.out.println("The net Annual Salary   :"+12*(e.monthlySal-e.pf-e.cgst+e.da));
		
	}
}