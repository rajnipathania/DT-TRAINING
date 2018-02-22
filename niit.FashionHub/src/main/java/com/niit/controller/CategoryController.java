package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;
@Controller
public class CategoryController {
	@Autowired
	CategoryDAO categoryDAOImpl;
	
	@RequestMapping("/admin/addC")
	public ModelAndView addC()
	{
		ModelAndView mv=new ModelAndView("AddCategory","command",new Category());
		return mv;
	}
	
	@RequestMapping("addcategory")
	public ModelAndView addCategory(@ModelAttribute Category c)
	{
		categoryDAOImpl.saveCategory(c);
		ModelAndView mv= new ModelAndView("redirect:/admin/viewC");
		return mv;
	}
	@RequestMapping("/admin/viewC")
	public ModelAndView m1()
	{
		//this is jsp filename
		ModelAndView mv=new ModelAndView("ViewCategory");
		List<Category> l=categoryDAOImpl.viewCategory();
		mv.addObject("List", l);
		return mv;
		
	}
	@RequestMapping("/admin/editC/{category_id}")
	public ModelAndView edit(@PathVariable String category_id)
	{
		Category c= categoryDAOImpl.getCategoryById(category_id);
		return new ModelAndView("EditCategory","command",c);

	}
	
	@RequestMapping("/admin/editcategory")
	public ModelAndView editSave(@ModelAttribute Category c)
	{
	 	categoryDAOImpl.updateCategory(c);
		System.out.println("EditSave");
		return new ModelAndView("redirect:/admin/viewC");	
	}	
	
	@RequestMapping("/admin/deleteC/{category_id}")
	public ModelAndView delete(@PathVariable String category_id)
	{
		categoryDAOImpl.deleteCategory(category_id);
		ModelAndView mv= new ModelAndView("redirect:/admin/viewC");
		return mv;
	}
}