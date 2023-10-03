package com.gqt.p1;


public class MainApp {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpid(1);
		e.setEmpname("Rahul");
		e.setEmpsalary(50000);
		e.setEmpcompany("GQT");
		
		System.out.println(e.getEmpid()+"--"+e.getEmpname()+"--"+e.getEmpsalary()+"--"+e.getEmpcompany());
	}
}
