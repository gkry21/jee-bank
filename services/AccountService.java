package com.bank.web.services;
import java.util.List;

import com.bank.web.domains.*;
public interface AccountService {
	public void createAccount(int money);
	public String createAccountNum();
	// ���¹�ȣ ����(1234-5678)
	public List<AccountBean> findAll();
	public AccountBean findByAccountNum(String accountNum);
	public int countAccounts();
	public boolean existAccountNum(String accountNum);
	public String findDate(); // ���ó�¥, ����ð�(�б���) ��ȯ
	public void depositMoney(AccountBean param);
	public void withdrawMoney(AccountBean param);
	public void deleteAccountNum(String accountNum);
}
