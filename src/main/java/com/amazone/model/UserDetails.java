package com.amazone.model;

public class UserDetails {

	private int userId;
	private String name;
	private String password;
	private String mailId;
	private long mobileNo;
	private String address;

	public UserDetails() {
		super();
	}

	public UserDetails(int userId, String name, String password, String mailId, long mobileNo, String address) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.mailId = mailId;
		this.mobileNo = mobileNo;
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getmailId() {
		return mailId;
	}

	public void setmailId(String mailId) {
		this.mailId = mailId;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", name=" + name + ", password=" + password + ", mailId=" + mailId
				+ ", mobileNo=" + mobileNo + ", address=" + address + "]";
	}

}
