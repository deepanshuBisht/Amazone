package com.amazone.model;

public class UserDetails {

	private String userId;
	private String name;
	private String password;
	private String mailId;
	private long mobileNo;
	private String address;
	private Double wallet;

	public UserDetails() {
		super();
	}

	public UserDetails(String userId, String name, String password, String mailId, long mobileNo, String address,
			Double wallet) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.mailId = mailId;
		this.mobileNo = mobileNo;
		this.address = address;
		this.wallet = wallet;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
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

	public Double getWallet() {
		return wallet;
	}

	public void setWallet(Double wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", name=" + name + ", password=" + password + ", mailId=" + mailId
				+ ", mobileNo=" + mobileNo + ", address=" + address + ", wallet=" + wallet + "]";
	}
	
}
