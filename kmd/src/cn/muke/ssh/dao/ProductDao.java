package cn.muke.ssh.dao;



import org.hibernate.SessionFactory;

import cn.muke.ssh.domain.Product;

public class ProductDao {
	private SessionFactory sessionFactory;

	public void save(Product product) {
		
		System.out.println("Dao中方法执行了。。。");
		try{
			String id =this.sessionFactory.getCurrentSession().save(product).toString();
			System.out.println(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	public void update(Product product) {
		
		System.out.println("Dao中方法执行了。。。");
		try{
			this.sessionFactory.getCurrentSession().update(product);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	public void delete(Product product) {
		
		System.out.println("Dao中方法执行了。。。");
		try{
			this.sessionFactory.getCurrentSession().delete(product);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
