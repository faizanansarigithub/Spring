package com.fa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.fa.bo.CoronaBO;

public class CoronaDAOImpl implements CoronaDAO{
	private static final String INSERT_PATIENT_QUERY="INSERT INTO SPRING_CORONA VALUES(CP_SEQ.NEXTVAL,?,?,?,?)";
	private DataSource ds;
	
	public CoronaDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(CoronaBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get pooled Connection
		con=ds.getConnection();
		//create PreparedStatement object
		ps=con.prepareStatement(INSERT_PATIENT_QUERY);
		//set query param
		ps.setString(1, bo.getPname());
		ps.setString(2, bo.getPaddrs());
		ps.setFloat(3, bo.getTotalAmt());
		ps.setLong(4, bo.getAdhar());
		count=ps.executeUpdate();
		return count;
	}

}
