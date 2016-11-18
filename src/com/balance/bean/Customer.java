package com.balance.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name="customer_details")
public class Customer 
{
	@Id
	@Column (name="customer_id")
	private int cust_id;
	@Column (name="customer_name")
	private String cust_name;
	@Column (name="customer_phone")
	private int cust_phone;
	@Column (name="customer_ttb")
	private int cust_ttb;
	@Column (name="customer_databal")
	private String cust_databal;
	@Column (name="customer_messagebal")
	private String cust_messagebal;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public int getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(int cust_phone) {
		this.cust_phone = cust_phone;
	}
	public int getCust_ttb() {
		return cust_ttb;
	}
	public void setCust_ttb(int cust_ttb) {
		this.cust_ttb = cust_ttb;
	}
	public String getCust_databal() {
		return cust_databal;
	}
	public void setCust_databal(String cust_databal) {
		this.cust_databal = cust_databal;
	}
	public String getCust_messagebal() {
		return cust_messagebal;
	}
	public void setCust_messagebal(String cust_messagebal) {
		this.cust_messagebal = cust_messagebal;
	}
}
