package com.wag.test;

import java.sql.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.wag.test.*;

public class commonCdHibernate {
	
	private static SessionFactory factory;

	public static void main(String[] args) {
		
		try
		{
		factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		catch(Throwable ex)
		{
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		
		commonCdHibernate ccd=new commonCdHibernate();
		Integer NUM_CD= ccd.addCommCd("hibTest","testapp","test",123,new java.sql.Date(20161103));

	}

	private Integer addCommCd(String alphCd, String codeDesc, String codeType , int createId, Date createDt)
	{
		Session session=factory.openSession();
		Transaction tx=null;
		 Integer num_cd=null;
		 
		 try
		 {
			 tx=session.beginTransaction();
			 commonCd cd= new commonCd(alphCd,codeDesc,codeType,createId,createDt);
			 num_cd=(Integer) session.save(cd);
			 tx.commit();
			 
			 System.out.println("NUMBER CD IS  " + num_cd);
		 
		 }
	catch(HibernateException e)
		 {
		  if (tx !=null) tx.rollback();
		  e.printStackTrace();
		 }	
	finally
		 {
			 session.close();
		 }
		 
		 return num_cd;
	}

}


