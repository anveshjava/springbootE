package com.springHibernateOrm.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	private String cid;
	private String cname;
	private String caddress;
	private int points;
	private Date shop_date;
	
	public Customer(String cid, String cname, String caddress, int points, Date shop_date) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
		this.points = points;
		this.shop_date = shop_date;
	}
	public Date getShop_date() {
		return shop_date;
	}
	public void setShop_date(Date shop_date) {
		this.shop_date = shop_date;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + ", points=" + points
				+ ", shop_date=" + shop_date + "]";
	}
	
}
