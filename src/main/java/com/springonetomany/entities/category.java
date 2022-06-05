package com.springonetomany.entities;

import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.persistence.Table;

@Entity
public class category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;
	private String cname;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="catid",referencedColumnName = "cId")
	private List<product> products;
	
	
	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<product> getProducts() {
		return products;
	}

	public void setProducts(List<product> products) {
		this.products = products;
	}

	public category(int cId, String cname, List<product> products) {
		super();
		this.cId = cId;
		this.cname = cname;
		this.products = products;
	}

	public category() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public void save(category c1) {
//		// TODO Auto-generated method stub
//		
//	}

	

	
	

	
	
	
	
	
}
