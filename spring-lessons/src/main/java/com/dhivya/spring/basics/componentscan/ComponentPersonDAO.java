package com.dhivya.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class ComponentPersonDAO {
	
	@Autowired
	ComponentJdbcConnection jdbcConnection;

	public ComponentJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
