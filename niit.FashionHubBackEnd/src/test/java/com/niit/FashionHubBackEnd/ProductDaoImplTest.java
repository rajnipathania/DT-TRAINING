package com.niit.FashionHubBackEnd;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.daoimpl.ProductDaoImpl;
import com.niit.model.Product;

public class ProductDaoImplTest {

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static Product product;
	@Autowired
	static ProductDaoImpl productDAOImpl;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		productDAOImpl=(ProductDaoImpl)context.getBean("productDAOImpl");
		product=(Product)context.getBean("product");
		System.out.println("Objects created successfully");
	
	}
	@Test
		public void createProductTestCase()
		{
			product.setProduct_id("90");
			product.setName("Nail Paint");
			product.setBrand("Revlon");
			product.setDescription("this is a men's wear");
			product.setPrice(600);
			System.out.println("Create Product");
			boolean status=productDAOImpl.saveProduct(product);;
			Assert.assertEquals("create Product Test Case", true, status);
			
		}
		

}

