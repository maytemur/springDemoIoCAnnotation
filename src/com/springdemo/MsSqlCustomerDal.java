package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

//@Component ("database")

public class MsSqlCustomerDal implements ICustomerDal {
	@Value ("${database.connectionString}")
	String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		System.out.println("Coonection String : " + this.connectionString);
		System.out.println("Microsoft Sql Veritabanına Eklendi");
		
	}

}
