package cn.muke.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


import cn.muke.ssh.domain.Product;
import cn.muke.ssh.service.ProductService;


public class ProductAction extends ActionSupport implements ModelDriven<Product> {
	private Product product = new Product();
	
	public Product getModel(){
		return product;
	}
	
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	public String save(){
		System.out.println("Action中的save方法执行了。。。");
		productService.save(product);
		return NONE;
	}
	

}
