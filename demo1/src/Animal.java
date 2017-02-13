
abstract class Animal {
	String type;
	String name;
	int age;
	int weight;

	void eat() {
		System.out.println("动物爱吃饭");
	}

	abstract void breath();

	void sleep() {
		System.out.println("动物在睡觉");
	}

}

class Tiger extends Animal {
	String tigerType;
	String from;

	void tigerRun() {
		System.out.println("老虎在奔跑");
	}

	void breath() {
		System.out.println("老虎是用肺呼吸的");

	}
}

class Fish extends Animal {
	String fishType;

	void swim() {
		System.out.println("鱼在游泳");
	}

	void breath() {
		System.out.println("鱼是用腮呼吸的");
	}
}
