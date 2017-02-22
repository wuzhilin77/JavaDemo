package cn.muke.ssh.action;

import cn.muke.ssh.domain.Product;
import cn.muke.ssh.service.ProductService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class ProductAction extends ActionSupport implements ModelDriven<Product> {
	private Product product;
	private ProductService productService;
	

	public String save(){
		System.out.println("Action中的save方法执行了。。。");
		productService.save(product);
		return NONE;
	}
	/********-------set and get--------------*****/

	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public ProductService getProductService() {
		return productService;
	}


	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	@Override
	public Product getModel() {
		return product;
	}
	
	


	

}
