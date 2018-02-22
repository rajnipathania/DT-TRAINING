package com.niit.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CategoryDAO;
import com.niit.dao.ProductDAO;
import com.niit.dao.UserDAO;
import com.niit.model.Category;
import com.niit.model.Supplier;
import com.niit.model.User;

@Controller
public class MyController  
{
	
	@Autowired
	UserDAO  userDAOImpl;	
	@Autowired
	ProductDAO productDAOImpl;	
	@Autowired
	CategoryDAO categoryDAOImpl;
    
    @RequestMapping("/")
    public String firstPage()
    {
	  return "FirstPage";
    }    
    @RequestMapping("/FirstPage")
    public String firstPage2()
    {
	  return "FirstPage";
    }
    @RequestMapping("/ContactUs")
    public String contact()
    {
	  return "ContactUs";
    }
    @RequestMapping("/Login")
    public String signinaccount()
    {
 	  return "Login";
    }
    @RequestMapping("/signin")
	public ModelAndView login(HttpServletRequest request,HttpSession session)
	{
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.print("username "+username +"  pass "+password);
		boolean x=userDAOImpl.validate(username, password);
		if(x)
		{
			session.setAttribute("username", username);
			return new ModelAndView("FirstPage");
		}
		else
		{
			return new ModelAndView("Login", "msg", "Invalid Credentials");
		}
	}
    
    @RequestMapping("/Register")
    public ModelAndView register()
	{
		ModelAndView mv= new ModelAndView("Register","command",new User());
		return mv;
	}
    @RequestMapping("/signup")
	public ModelAndView ModelAndView(@ModelAttribute User u)
	{
		System.out.println("inside register controller "+u);
		u.setRole("ROLE_USER");
		u.setEnabled(true);		
		userDAOImpl.save(u);
		return new ModelAndView("Login","msg","Registration Successful! Login to Continue.");
	}

   @RequestMapping("/header")
   public ModelAndView header()
   {
	System.out.println("CALLING HEADER");
	ModelAndView mv=new ModelAndView("Header");
	List<Category> listC=categoryDAOImpl.viewCategory();
	System.out.println("category values are"+listC);
	mv.addObject("ListC", listC);
	System.out.println("eNDING HEADER");		 
	return mv;
   }  

   
}