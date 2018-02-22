package com.niit.FashionHubBackEnd;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDAO;
import com.niit.daoimpl.CategoryDaoImpl;
import com.niit.model.Category;


public class CategoryDaoImplTest {

	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static CategoryDaoImpl categoryDAOImpl;
	
	@Autowired
	static Category category;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		categoryDAOImpl=(CategoryDaoImpl)context.getBean("categoryDAOImpl");
		category=(Category)context.getBean("category");
		System.out.println("Objects created successfully");
	
	}
	
	@Test
	public void createCategoryTestCase()
	{
		category.setCategory_id("90");
		category.setCategory_name("Jeans");
		category.setCategory_description("shopping material");
		System.out.println("Create Category");
		boolean status=categoryDAOImpl.saveCategory(category);
		Assert.assertEquals("create Category Test Case", true, status);
		
	}
	
	
}
