package com.niit.dao;

import java.util.List;

import com.niit.model.Supplier;

public interface SupplierDAO {
		
		public List<Supplier> viewSupplier();

		public boolean saveSupplier(Supplier s);
		
		public void editSupplier(String supplier_id);
		
		public boolean deleteSupplier(String supplier_id);
		
		public Supplier getSupplierById(String supplier_id);
		
		public boolean updateSupplier(Supplier s);


	}
