package com.fee.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fee.dao.FeeDao;
import com.fee.domain.Fee;

@Transactional
public class FeeServiceImpl implements FeeService{
	
	@Resource
	FeeDao feeDao;
	
	public Fee insertFeeInfo(Fee fee){
		return feeDao.insertFeeInfo(fee);
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List<Fee> queryAllFees(){
		return feeDao.queryAllFees();
	}
}
