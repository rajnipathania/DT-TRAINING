package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.niit.dao.CategoryDAO;
import com.niit.dao.ProductDAO;
import com.niit.dao.SupplierDAO;
import com.niit.model.Category;

@Controller
public class AdminController
{	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/Admin")
	public ModelAndView admin()
	{
		
		ModelAndView mv= new ModelAndView("Admin");
		List<Category> listC=categoryDAO.viewCategory();
		System.out.println("category values are"+listC);
		mv.addObject("ListC", listC);
		return mv;
	}
	@RequestMapping("/signout")
	public ModelAndView logout(HttpSession session)
	{
		session.setAttribute("username", "");
		session.invalidate();
		ModelAndView mv = new ModelAndView("Login");
		return mv;
	}

}