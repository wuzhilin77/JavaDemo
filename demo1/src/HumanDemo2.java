public class HumanDemo2 {
	public static void main(String[] args) {
		Human zhangsan = new Human();
		Human qq = new Human("青青", "女", 0, null);
		Human lisi = new Human("李四", "男", 20, "中国上海");
		System.out.println("张三的信息：");
		System.out.println("姓名：" + zhangsan.name + "\n 性别：" + zhangsan.sex
				+ "\n 年龄：" + zhangsan.age + "\n地址：" + zhangsan.addr);
		System.out.println("青青的信息:");
		System.out.println("姓名：" + qq.name + "\n 性别：" + qq.sex + "\n 年龄："
				+ qq.age + "\n地址：" + qq.addr);
		System.out.println("李四的信息:");
		System.out.println("姓名：" + lisi.name + "\n 性别：" + lisi.sex + "\n 年龄："
				+ lisi.age + "\n地址：" + lisi.addr);

	}

}
