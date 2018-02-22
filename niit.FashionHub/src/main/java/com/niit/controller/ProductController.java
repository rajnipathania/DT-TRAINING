package com.niit.controller;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.ProductDAO;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;
@Controller
public class ProductController {
	@Autowired
	ProductDAO  productDAOImpl;
	
	@RequestMapping("/admin/addP")
	public ModelAndView addP(@ModelAttribute Product product)
	{
		ModelAndView mv= new ModelAndView("AddProduct","command",new Product());
		List<Category> listC=productDAOImpl.getCategoryname();
		mv.addObject("ListC", listC);
		List<Supplier> listS=productDAOImpl.getSuppliername();
		mv.addObject("ListS", listS);
		return mv;
	}
	
	@RequestMapping("product/{category_name}")
	public ModelAndView displayProducts(@PathVariable String category_name)
	{
		ModelAndView mv= new ModelAndView("product");
		List<Product> list=productDAOImpl.viewProductByCategory(category_name);
   		mv.addObject("pr",list);
		return mv;
	}
	
	@RequestMapping("ProductDetails/{product_id}")
	public ModelAndView productDetails(@PathVariable String product_id)
	{
		Product p= productDAOImpl.getProductById(product_id);
		ModelAndView mv=new ModelAndView("ProductDetails");
		mv.addObject("product", p);
		return mv;
	}
	/* 
	@RequestMapping(value="/addproduct",method=RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute Product product)
	{
		String filename=null; //image file name
		byte[] bytes;
		System.out.println("Get Image"+product);
		if(!product.getImage().isEmpty())
			try {
				bytes=product.getImage().getBytes();
				productDAOImpl.saveProduct(product);
				String path="F:/RAJNI/niit.FashionHub/src/main/webapp/resources/image/"+product.getProduct_id()+".jpg";
				File f=new File(path);
				BufferedOutputStream bs=new BufferedOutputStream(new FileOutputStream(f));
				bs.write(bytes);
				bs.close();
			}
			catch(Exception ex)
				{
					System.out.println(ex);
					
				}
				ModelAndView mv= new ModelAndView("redirect:/viewP");
				return mv;
		}
	*/
	 @RequestMapping(value="/addproduct",method=RequestMethod.POST)
    public String addProduct(HttpServletRequest request,@Valid @ModelAttribute(name="product")  Product product,BindingResult result,Model model) {//3
		/*if(result.hasErrors()){ 
			List<Category> categories= productDAOImpl.getCategoryname();
			model.addAttribute("categories",categories);
			return "Admin";
		}
		 */
		
		productDAOImpl.saveProduct(product); //insert and update
    	String rootDirectory=request.getSession().getServletContext().getRealPath("/");
    	System.out.println("Root directory "+rootDirectory);
    	Path path=Paths.get(rootDirectory + "/resources/images/"+product.getProduct_id()+".jpg");
    	MultipartFile prodImage=product.getImage(); 
    	try {
			prodImage.transferTo(new File(path.toString()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
    	return "redirect:/admin/viewP";
    }
	 
	
	
	
	@RequestMapping("/admin/viewP")
	public ModelAndView m1()
	{
		ModelAndView mv=new ModelAndView("ViewProduct");
		List<Product> l=productDAOImpl.viewProduct();
		mv.addObject("List", l);
		return mv;
	 	
	}	
	 
	@RequestMapping("/admin/editP/{product_id}")
	public ModelAndView edit(@PathVariable String product_id)
	{
		Product p= productDAOImpl.getProductById(product_id);
		System.out.println("EDIT PRODUCT "+p);
		return new ModelAndView("EditProduct","command",p);
	}
	
	@RequestMapping("/admin/editproduct")
	public ModelAndView editSave(@ModelAttribute Product p)
	{
		System.out.println("INSIDE EDIT SAVE");
	 	productDAOImpl.updateProduct(p);
		System.out.println("EditSave"+p);
		return new ModelAndView("redirect:/viewP");	
	}	
	
	@RequestMapping("/admin/deleteP/{product_id}")
	public ModelAndView delete(@PathVariable String product_id)
	{
		productDAOImpl.deleteProduct(product_id);
		ModelAndView mv= new ModelAndView("redirect:/viewP");
		return mv;
	}
	
	
	
}
