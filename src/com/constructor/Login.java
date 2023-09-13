package com.constructor;

public class Login {
	private String userName;
	private String passWord;
	private Long phNumber;

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getPassWord() {
		return passWord;
	}
	public void setPhNumber(long phNumber) {
		this.phNumber=phNumber;
	}
	public Long getPhNumber() {
		return this.phNumber;
	}

}
