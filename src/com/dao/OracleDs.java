package com.dao;

import java.sql.Connection;

public class OracleDs implements DB{
	public Connection connect(){
		System.out.println("Oracle");
		return null;
	}

}
