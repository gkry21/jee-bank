package com.bank.web.domains;

public class CustomerBean extends MemberBean{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String credit;

		public String getCredit() {
			return credit;
		}

		public void setCredit(String credit) {
			this.credit = credit;
		}

		@Override
		public String toString() {
			return "ȸ������ [id=" + getId() 
			+ "��й�ȣ =" + getPw()
			+ "�̸� =" +getName()
			+"�ֹι�ȣ=" +getSsn()
			+"�ſ뵵 ="+credit + "]";
		}
}
