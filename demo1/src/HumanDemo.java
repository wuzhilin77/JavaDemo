public class HumanDemo {
	public static void main(String[] args) {
		Human zhangsan = new Human("张三", "男", 25, "中国北京");
		Human lisi = new Human("李四", "男", 20, "中国上海");
		System.out.println("张三的信息");
		System.out.println("姓名：" + zhangsan.name);
		System.out.println("性别：" + zhangsan.sex);
		System.out.println("年龄：" + zhangsan.age);
		System.out.println("地址：" + zhangsan.addr);
		System.out.println("李四的信息");
		System.out.println("姓名：" + lisi.name);
		System.out.println("性别：" + lisi.sex);
		System.out.println("年龄：" + lisi.age);
		System.out.println("地址：" + lisi.addr);
	}

}