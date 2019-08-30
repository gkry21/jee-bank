package com.bank.web.domains;

import java.io.Serializable;

public class AccountBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String accountNum, regdate, money;

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "신용정보 [account=" + accountNum
				+ ", regdate=" + regdate 
				+ ", money=" + money + "]";
	}
	
}
