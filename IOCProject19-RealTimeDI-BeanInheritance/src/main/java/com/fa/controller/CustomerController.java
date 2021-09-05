package com.fa.controller;

import com.fa.dto.CustomerDTO;
import com.fa.service.CustomerMgmtServiceImpl;
import com.fa.vo.CustomerVO;

public final class CustomerController {
	private CustomerMgmtServiceImpl service;

	public CustomerController(CustomerMgmtServiceImpl service) {
		this.service = service;
	}
	public String processCustomer(CustomerVO vo)throws Exception{
		CustomerDTO dto=null;
		String result=null;
		dto=new CustomerDTO();
		dto.setCname(vo.getCname());
		dto.setCaddrs(vo.getCaddrs());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		result=service.calculatIntrestAmount(dto);
		return result;
	}
}
