package com.fa.controller;

import com.fa.dto.CoronaDTO;
import com.fa.service.CoronaMgmtServiceImpl;
import com.fa.vo.CoronaVO;

public class CoronaController {
	private CoronaMgmtServiceImpl service;

	public CoronaController(CoronaMgmtServiceImpl service) {
		this.service = service;
	}
	public String processPatient(CoronaVO vo)throws Exception{
		CoronaDTO dto=null;
		dto=new CoronaDTO();
		dto.setPname(vo.getPaddrs());
		dto.setPaddrs(vo.getPaddrs());
		dto.setDays(Float.parseFloat(vo.getDays()));
		dto.setAdhar(Long.parseLong(vo.getAdhar()));
		return service.calculatePatientBill(dto);
	}
}
