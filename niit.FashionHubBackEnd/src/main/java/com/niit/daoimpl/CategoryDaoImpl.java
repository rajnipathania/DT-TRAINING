package com.niit.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;

@SuppressWarnings({ "unused", "deprecation" })
@Repository("categoryDao")
public class CategoryDaoImpl  implements CategoryDAO{
		
		@Autowired
		SessionFactory sessionFactory; 
		
		
		public CategoryDaoImpl(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
			
		}  

		public List<Category> viewCategory() {
			// TODO Auto-generated method stub 
			Session sess=sessionFactory.openSession();
			Transaction tx=sess.beginTransaction();
			String hql="from Category";
			Query q=sess.createQuery(hql);
			
			List<Category> l=q.list();
			return l;
		}

		public boolean saveCategory(Category c) {
			// TODO Auto-generated method stub
			try{
			Session sess=sessionFactory.openSession();
			Transaction tx=sess.beginTransaction();
			sess.save(c);
			tx.commit();
			sess.close();
			return true;
			}
			catch(Exception e)
			{
				System.out.println("Exception occurred"+e);
				return false;
			}
		}

		public void editCategory(String category_id) {
			// TODO Auto-generated method stub
			Session sess=sessionFactory.openSession();
			Transaction tx=sess.beginTransaction();
			Category c=(Category) sess.get(Category.class, category_id);
			sess.update(c);
			tx.commit();
			sess.close();
		}

		public boolean deleteCategory(String category_id) {
			// TODO Auto-generated method stub
			try{
			Session sess=sessionFactory.openSession();
			Transaction tx=sess.beginTransaction();
			Category c=(Category) sess.get(Category.class, category_id);
			sess.delete(c);
			tx.commit();
			sess.close();
			return true;
			}
			catch(Exception ex){
				System.out.println("Exception"+ex);
				return false;
			}
		}

		public Category getCategoryById(String category_id) {
			// TODO Auto-generated method stub
			Session sess=sessionFactory.openSession();
			Category c=(Category) sess.get(Category.class,category_id);
			return c;
		}
		
		
		public boolean updateCategory(Category c) {
			// TODO Auto-generated method stub
			try{
			Session sess=sessionFactory.openSession();
			Transaction tx=sess.beginTransaction();
			sess.update(c);
			tx.commit();
			sess.close();
			return true;
			}
			catch(Exception ex){
				System.out.println("Exception"+ex);
				return false;
			}
		}

	}
