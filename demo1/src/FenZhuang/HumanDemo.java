package FenZhuang;

class Human {
	private String name;
	private String sex;
	private int age;
	private String addr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	

}

public class HumanDemo {
	public static void main(String[] args) {
		Human zhangsan = new Human();
		zhangsan.setName("张三");
		zhangsan.setAge(25);
		zhangsan.setSex("男");
		zhangsan.setAddr("中国北京");
		System.out.println("张三的个人信息如下:");
		System.out.println("姓名：" + zhangsan.getName());
		System.out.println("性别：" + zhangsan.getSex());
		System.out.println("年龄:" + zhangsan.getAge());
		System.out.println("地址：" + zhangsan.getAddr());

	}
}