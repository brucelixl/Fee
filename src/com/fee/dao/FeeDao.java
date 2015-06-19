package com.fee.dao;

import java.util.List;

import com.fee.domain.Fee;

public interface FeeDao {
	public Fee insertFeeInfo(Fee fee);
	
	public List<Fee> queryAllFees();
}
