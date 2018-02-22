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
	public class Supplier implements Serializable  {
		private static final long serialVersionUID = 1L;
		@Id 
		private String supplier_id;  
		public String getSupplier_id() {
			return supplier_id;
		}


		public void setSupplier_id(String supplier_id) {
			this.supplier_id = supplier_id;
		}


		private String supplier_name;
		private String supplier_address;
		public String getSupplier_name() {
			return supplier_name;
		}


		public void setSupplier_name(String supplier_name) {
			this.supplier_name = supplier_name;
		}


		public String getSupplier_address() {
			return supplier_address;
		}


		public void setSupplier_address(String supplier_address) {
			this.supplier_address = supplier_address;
		}


		public Set<Product> getProducts() {
			return products;
		}


		public void setProducts(Set<Product> products) {
			this.products = products;
		}


		@OneToMany(targetEntity=Product.class,fetch=FetchType.EAGER,mappedBy="supplier")
		private Set<Product> products=new HashSet<Product>(0);
	 
		 
		@Override
		public String toString() {
			return "Supplier [supplier_id=" + supplier_id + ", supplier_name=" + supplier_name + ", supplier_address="
					+ supplier_address + "]";
		}

		
	}
