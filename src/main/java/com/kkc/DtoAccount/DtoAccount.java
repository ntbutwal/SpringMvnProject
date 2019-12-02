package com.kkc.DtoAccount;

public class DtoAccount {
	private String bankName;
	private String accountHolderName;
	private String address;
	private String phNumber;
	private double initialAmmount;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

	public double getInitialAmmount() {
		return initialAmmount;
	}

	public void setInitialAmmount(double initialAmmount) {
		this.initialAmmount = initialAmmount;
	}

}
