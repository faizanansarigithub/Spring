package com.fa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.fa.bo.CustomerBO;

public class CustomerDAOImpl implements CustomerDAO {
	private final static String CUSTOMER_INSERT_QUERY="INSERT INTO SPRING_CUSTOMER VALUES(CUS_SEQ.NEXTVAL,?,?,?,?)";
	DataSource ds;

	public CustomerDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		//get poolled connection
		con=ds.getConnection();
		//create preparedStatement obj
		ps=con.prepareStatement(CUSTOMER_INSERT_QUERY);
		//set value to query param 
		ps.setString(1, bo.getCname());
		ps.setString(2, bo.getCaddrs());
		ps.setFloat(3, bo.getpAmt());
		ps.setFloat(4, bo.getIntrstAmt());
		//execute SQL query
		result=ps.executeUpdate();
		//close connection
		ps.close();
		con.close();
		return result;
	}
}