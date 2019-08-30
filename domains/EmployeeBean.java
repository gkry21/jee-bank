package com.bank.web.domains;

public class EmployeeBean extends MemberBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sabun;

	public String getSabun() {
		return sabun;
	}

	public void setSabun(String sabun) {
		this.sabun = sabun;
	}

	@Override
	public String toString() {
		return "사원정보 [사원번호=" + sabun
				+ "id=" + getId() 
				+ "비밀번호 =" + getPw() 
				+ "이름 =" +getName() 
				+ "주민번호=" +getSsn() + "]";
	}
	
}
