package com.dbsproj.ford.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankAccount {
	@Id
	int customerId;
	 String customerName;
	 int balance;
	 boolean od;
		public BankAccount()
		{
			super();
		}
		public BankAccount(int cId,String cName,int bal,boolean o)
		{
			super();
			customerId=cId;
			customerName=cName;
			balance=bal;
			od=o;
		}
	 public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public boolean isOd() {
		return od;
	}
	public void setOd(boolean od) {
		this.od = od;
	}
	
	

}
