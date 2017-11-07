package com.dao;

import java.sql.Connection;

public class MySqlDB implements DB{
	public Connection connect(){
		System.out.println("MySQL");
		return null;
	}

}
