package cn.muke.ssh.domain;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private Integer pid;
	private String pname;
	private Double price;

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** full constructor */
	public Product(String pname, Double price) {
		this.pname = pname;
		this.price = price;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}