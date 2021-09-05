package com.fa.service;

import com.fa.bo.CustomerBO;
import com.fa.dao.CustomerDAO;
import com.fa.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements CustomerMgmtService {
	private CustomerDAO dao;
	

	public CustomerMgmtServiceImpl(CustomerDAO dao) {
	
		this.dao = dao;
	}


	@Override
	public String calculatIntrestAmount(CustomerDTO dto) throws Exception {
		float intrAmt=0.0f;
		CustomerBO bo;
		//calculate interAmount
		intrAmt = (dto.getPamt()*dto.getRate()*dto.getTime())/100.0f;
		bo=new CustomerBO();
		bo.setCname(dto.getCname());
		bo.setCaddrs(dto.getCaddrs());
		bo.setpAmt(dto.getPamt());
		bo.setIntrstAmt(intrAmt);
		int result=dao.insert(bo);
		if(result==0)
			return "Record is not inserted principle Amount is "+dto.getPamt()+"and interst is "+intrAmt;
		else
			return "Record is inserted principle Amount is "+dto.getPamt()+" and interst is "+intrAmt;
		
	}

}
