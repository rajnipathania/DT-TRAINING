package com.niit.model;
 

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Category implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id 
    private String category_id; 
	private String category_name;
	private String category_description;
	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}



	@OneToMany(targetEntity=Product.class,fetch=FetchType.EAGER,mappedBy="category")
	private Set<Product> products=new HashSet<Product>(0);
	
	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getCategory_description() {
		return category_description;
	}

	public void setCategory_description(String category_description) {
		this.category_description = category_description;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}


  
	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", category_name=" + category_name + ", category_description="
				+ category_description + "]";
	}
	
	

}



















