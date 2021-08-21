package com.fa.service;

import com.fa.bo.CoronaBO;
import com.fa.dao.CoronaDAOImpl;
import com.fa.dto.CoronaDTO;

public class CoronaMgmtServiceImpl implements CoronaMgmtService {
	private CoronaDAOImpl dao;
	
	public CoronaMgmtServiceImpl(CoronaDAOImpl dao) {
		this.dao = dao;
	}

	@Override
	public String calculatePatientBill(CoronaDTO dto) throws Exception {
		float totalAmt=0.0f;
		CoronaBO bo=null;
		int result=0;
		totalAmt=dto.getDays()*300;
		bo=new CoronaBO();
		bo.setPname(dto.getPname());
		bo.setPaddrs(dto.getPaddrs());
		bo.setTotalAmt(totalAmt);
		bo.setAdhar(bo.getAdhar());
		result=dao.insert(bo);
		if(result==0)
			return "Registration not Successfully Your total Bill Amount is "+totalAmt;
		else
			return "Registration Successfully Your total Bill Amount is "+totalAmt;
	}

}
