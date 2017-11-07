package com.dao;

public class EmployeeDAO {
	DB b;
	
	public EmployeeDAO(DB b) {
		// TODO Auto-generated method stub
		this.b=b;
		
	}
	 public void display(){
		
		 b.connect();
		
	}

}
