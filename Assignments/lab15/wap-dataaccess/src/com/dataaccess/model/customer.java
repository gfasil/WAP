package com.dataaccess.model;

public class customer {

	private int custid;
	private String fname;
	private String gender;
	private category category;
	private String message;
	
	public customer() {
		
		
	}
	public customer(String fname, String gender, String category,
			String message) {
		super();
		
		this.fname = fname;
		this.gender = gender;
		this.category = com.dataaccess.model.category.valueOf(category);
		this.message = message;
	}
	public customer(int custid,String fname, String gender, String category,
			String message) {
		super();
		this.custid=custid;
		this.fname = fname;
		this.gender = gender;
		this.category = com.dataaccess.model.category.valueOf(category);
		this.message = message;
	}

	public int getCustid() {
		return custid;
	}
	
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCategory() {
		return category.name();
	}
	public void setCategory(String category) {
		this.category = com.dataaccess.model.category.valueOf(category);
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}

