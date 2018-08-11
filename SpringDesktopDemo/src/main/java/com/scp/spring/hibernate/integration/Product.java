package com.scp.spring.hibernate.integration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_spring")
public class Product {
	@Id
	private int prodId;
	private String prodName;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodId, String prodName) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	@Override
	public String toString() {
		return "\nProduct [prodId=" + prodId + ", prodName=" + prodName + "]";
	}
	
	
}
