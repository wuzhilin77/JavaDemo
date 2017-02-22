package cn.muke.ssh.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import cn.muke.ssh.domain.Product;

public class ProductDao extends HibernateDaoSupport {

	public void save(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Dao中方法执行了。。。");
		this.getHibernateTemplate().save(product);
		
	}

}
