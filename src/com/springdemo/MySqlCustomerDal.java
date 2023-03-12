package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

//import org.springframework.stereotype.Component;

//@Component ("database")
//bnuları yorum satırı haline getirince IocConfig içinde @Bean olarak tanımlamamız gerekir

public class MySqlCustomerDal implements ICustomerDal {
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
		System.out.println("Veritabanına Eklendi mySql"); 
		
	}
	

}
