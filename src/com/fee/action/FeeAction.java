package com.fee.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.fee.domain.Fee;
import com.fee.service.FeeService;
import com.opensymphony.xwork2.ActionSupport;

public class FeeAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Fee fee;
	private List<Fee> fees;
	@Resource
	private FeeService feeService;
	
	public Fee getFee() {
		return fee;
	}
	public void setFee(Fee fee) {
		this.fee = fee;
	}
	
	public List<Fee> getFees() {
		return fees;
	}
	public void setFees(List<Fee> fees) {
		this.fees = fees;
	}
	public FeeService getFeeService() {
		return feeService;
	}
	public void setFeeService(FeeService feeService) {
		this.feeService = feeService;
	}
	public String queryFees(){
		fees=feeService.queryAllFees();
		return "show";
	}
	public String AddFee(){
		if(feeService.insertFeeInfo(fee)!=null){
			fees=feeService.queryAllFees();
			return "addSuccess";
		}else{
			return "addFailed";
		}	
	}
	
	
	
}
