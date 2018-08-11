package com.scp.springdemo;

public class Student {
	private int studId;
	private String studFName;
	private String studLName;
	private Address address;
	//private Address ad1;
	public Student() {
		super();
		System.out.println("In default constructor");
	}
	public Student(int studId, String studFName, String studLName, Address address) {
		super();
		this.studId = studId;
		this.studFName = studFName;
		this.studLName = studLName;
		this.address = address;
		System.out.println("In para constructor");
	}
	
	/*public Student(int studId, String studFName, String studLName, Address address, Address ad1) {
		super();
		this.studId = studId;
		this.studFName = studFName;
		this.studLName = studLName;
		this.address = address;
		this.ad1 = ad1;
	}*/
	
	/*public Address getAd1() {
		return ad1;
	}
	public void setAd1(Address ad1) {
		this.ad1 = ad1;
	}*/
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudFName() {
		return studFName;
	}
	public void setStudFName(String studFName) {
		this.studFName = studFName;
	}
	public String getStudLName() {
		return studLName;
	}
	public void setStudLName(String studLName) {
		this.studLName = studLName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((studFName == null) ? 0 : studFName.hashCode());
		result = prime * result + studId;
		result = prime * result + ((studLName == null) ? 0 : studLName.hashCode());
		return result;
	}*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (studFName == null) {
			if (other.studFName != null)
				return false;
		} else if (!studFName.equals(other.studFName))
			return false;
		if (studId != other.studId)
			return false;
		if (studLName == null) {
			if (other.studLName != null)
				return false;
		} else if (!studLName.equals(other.studLName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studFName=" + studFName + ", studLName=" + studLName + ", address="
				+ address + "]";
	}
	/*@Override
	public String toString() {
		return "Student [studId=" + studId + ", studFName=" + studFName + ", studLName=" + studLName + ", address="
				+ address + ", ad1=" + ad1 + "]";
	}*/
	
	
	
	
	
}
