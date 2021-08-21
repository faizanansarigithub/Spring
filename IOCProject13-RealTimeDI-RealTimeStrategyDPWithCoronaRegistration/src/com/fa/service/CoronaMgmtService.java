package com.fa.service;

import com.fa.dto.CoronaDTO;

public interface CoronaMgmtService {
	public String calculatePatientBill(CoronaDTO dto) throws Exception;
}
