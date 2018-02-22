package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;
@Controller
public class SupplierController{

	@Autowired
	SupplierDAO supplierDAOImpl;
	
	@RequestMapping("/admin/addS")
	public ModelAndView addS()
	{
		ModelAndView mv= new ModelAndView("AddSupplier","command",new Supplier());
		return mv;
	}
	 
	@RequestMapping("/addsupplier")
	public ModelAndView addSupplier(@ModelAttribute Supplier s)
	{
		supplierDAOImpl.saveSupplier(s);
		ModelAndView mv= new ModelAndView("redirect://admin/viewS");
		return mv;
	}
	
	@RequestMapping("/admin/viewS")
	public ModelAndView m1()
	{
		ModelAndView mv=new ModelAndView("ViewSupplier");
		List<Supplier> l=supplierDAOImpl.viewSupplier();
		mv.addObject("List", l);
		return mv;		
	}
	
	@RequestMapping("/admin/editS/{supplier_id}")
	public ModelAndView edit(@PathVariable String supplier_id)
	{
		Supplier s=supplierDAOImpl.getSupplierById(supplier_id);
		return new ModelAndView("EditSupplier","command",s);

	}
	
	@RequestMapping("/editsupplier")
	public ModelAndView editSave(@ModelAttribute Supplier command)
	{
	 	supplierDAOImpl.updateSupplier(command);
		System.out.println("EditSave");
		return new ModelAndView("redirect:/admin/viewS","command",new Supplier());	
	}
	
	@RequestMapping("/admin/deleteS/{supplier_id}")
	public ModelAndView delete(@PathVariable String supplier_id)
	{
		supplierDAOImpl.deleteSupplier(supplier_id);
		return new ModelAndView("redirect:/admin/viewS");
		
	}
	

}
