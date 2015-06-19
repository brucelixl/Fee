package com.fee.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.fee.domain.Fee;

public class FeeDaoImpl implements FeeDao{
	@Resource
	SessionFactory sessionFactory;
	
	public Fee insertFeeInfo(Fee fee){
		sessionFactory.getCurrentSession().persist(fee);
		return fee;
	}
	public List<Fee> queryAllFees(){
	Session session=null;
		try{
			session=sessionFactory.getCurrentSession();
			String queryString="from Fee";
			Query queryObject=session.createQuery(queryString);
			List<Fee> list=queryObject.list();
			return list;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			sessionFactory.close();//调用HibernateSessionFactory的静态方法关闭Session
		}
	}
}
