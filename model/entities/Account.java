package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimet;
	
	public Account() {
		super();
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimet) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimet = withdrawLimet;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimet() {
		return withdrawLimet;
	}

	public void setWithdrawLimet(Double withdrawLimet) {
		this.withdrawLimet = withdrawLimet;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) throws DomainException {
		if (withdrawLimet < amount) {
			throw new DomainException ("The amount exceeds withdraw limit");
		}else if(balance < amount ){ 
			throw new DomainException ("Not enough balance");
		}
		balance -= amount;	
	}	
}
