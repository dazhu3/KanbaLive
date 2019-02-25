package com.mmc.entity;

public class User {

	private String uname = null;
	private String upass = null;

	public User() {

	}

	public User(String uname, String upass) {
		super();
		this.uname = uname;
		this.upass = upass;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	@Override
	public String toString() {
		return "User [uname=" + uname + ", upass=" + upass + "]";
	}
	
	public static void main(String[] args) {
		
	}

}
