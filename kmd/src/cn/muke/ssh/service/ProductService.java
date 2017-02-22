package cn.muke.ssh.service;

import org.springframework.transaction.annotation.Transactional;
import cn.muke.ssh.dao.ProductDao;
import cn.muke.ssh.domain.Product;

@Transactional
public class ProductService {
	private ProductDao productDao;
	public void setProductDao(ProductDao productDao){
		this.productDao = productDao;
	}
	
	public void save(Product product) {
		System.out.println("Service中的save方法执行了。。。");
		productDao.save(product);
	}

	public ProductDao getProductDao() {
		return productDao;
	}
	

}
