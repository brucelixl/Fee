package com.fee.service;

import java.util.List;

import com.fee.domain.Fee;

public interface FeeService {
     public Fee insertFeeInfo(Fee fee);

	public List<Fee> queryAllFees();
}
