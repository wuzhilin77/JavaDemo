class Animal {
	String type;
	String name;
	int age;
	int weight;

	void eat() {
		System.out.println("animal eat");
	}

	void breath() {
		System.out.println("animal breath");
	}

	void sleep() {
		System.out.println("animal sleep");
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

public class DuoTaiDemo {
	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Animal();
		animal[1] = new Tiger();
		animal[2] = new Fish();
		animal[0].breath();
		animal[1].breath();
		animal[2].breath();

	}

}
