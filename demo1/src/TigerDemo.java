public class TigerDemo {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.type = "Tiger";
		tiger.name = "huhu";
		tiger.age = 12;
		tiger.weight = 120;
		tiger.tigerType = "东北虎";
		tiger.from = "长白山";
		System.out.println("Animal属性:种类=" + tiger.type);
		System.out.println("Animal属性:名字=" + tiger.name);
		System.out.println("Animal属性:年龄=" + tiger.age);
		System.out.println("Animal属性:体重=" + tiger.weight);
		System.out.println("Animal属性:老虎种类=" + tiger.tigerType);
		System.out.println("Animal方法：呼吸");
		tiger.breath();
		System.out.println("Animal方法：吃饭");
		tiger.eat();
		System.out.println("Animal方法：睡觉");
		tiger.sleep();
		System.out.println("Animal方法：奔跑");
		tiger.tigerRun();
	}

}