package com.mphasis.training.entities;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Check;
import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.NotFound;

import com.mphasis.training.assignment.Case;
import com.mphasis.training.assignment.CaseMode;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Shop {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int shopid;
	@Column(nullable=false,length=45)
	//@Check(constraints="upper(shopname)")
	@Case(value=CaseMode.UPPER)
	private String shopname;
	private String address;
	/*@OneToMany(mappedBy="shop", fetch=FetchType.LAZY)
	private List<Products> products;*/
	
	public int getShopid() {
		return shopid;
	}
	public void setShopid(int shopid) {
		this.shopid = shopid;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	/*public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}*/
	
	

}
