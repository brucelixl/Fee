package com.fee.domain;

public class Fee {
	
	private String payId;
	private String Bid;
	private String Roomid;
	private String ownerName;	
	private String payType;
	private double lastMonthInfo;
	private double thisMonthInfo;
	private double unitPrice;
	private double monthPay;
	
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public String getBid() {
		return Bid;
	}
	public void setBid(String Bid) {
		this.Bid = Bid;
	}
	public String getRoomId() {
		return Roomid;
	}
	public void setRoomid(String Roomid) {
		this.Roomid = Roomid;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public double getLastMonthInfo() {
		return lastMonthInfo;
	}
	public void setLastMonthInfo(double lastMonthInfo) {
		this.lastMonthInfo = lastMonthInfo;
	}
	public double getThisMonthInfo() {
		return thisMonthInfo;
	}
	public void setThisMonthInfo(double thisMonthInfo) {
		this.thisMonthInfo = thisMonthInfo;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getMonthPay() {
		return monthPay;
	}
	public void setMonthPay(double monthPay) {
		this.monthPay = monthPay;
	}
	
	
}
