package com.niit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;
import com.niit.model.User;

@SuppressWarnings("deprecation")
@ComponentScan("com.niit")
	@Configuration
	@EnableTransactionManagement
	public class DBConfig {

		@Bean(name = "dataSource")
		public DataSource getDataSource() {
		   DriverManagerDataSource dataSource=new DriverManagerDataSource();
		    dataSource.setDriverClassName("org.h2.Driver");
		    dataSource.setUrl("jdbc:h2:tcp://localhost/~/myshop1");
		    dataSource.setUsername("sa");
		    dataSource.setPassword("root");

		    return dataSource;
		}
		
		public Properties getHibernateProperties()
		{
			Properties properties=new Properties();
			properties.put("hibernate.show_sql", "true");
			properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
			properties.put("hibernate.hbm2ddl.auto", "update");
			return properties;
			
		}

		@Autowired
		@Bean(name = "sessionFactory")
		public SessionFactory getSessionFactory(DataSource dataSource) {

		    LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		    sessionBuilder.addProperties(getHibernateProperties());
		    sessionBuilder.addAnnotatedClasses(User.class);
		    sessionBuilder.addAnnotatedClasses(Category.class);
		    sessionBuilder.addAnnotatedClasses(Supplier.class);
		    sessionBuilder.addAnnotatedClasses(Product.class); 

		    return sessionBuilder.buildSessionFactory();
		}

		@SuppressWarnings("deprecation")
		@Autowired
		@Bean(name = "transactionManager")
		public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	        HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		    return transactionManager;
		}
		  

	}
