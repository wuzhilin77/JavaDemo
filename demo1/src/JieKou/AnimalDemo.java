package JieKou;

interface Animal {
	int BIG_TYPE = 5;

	void sleep();

	void eat();

	void breath();
}

interface Mammal extends Animal {
	void run();
}

class Tiger implements Mammal {
	String name;

	public Tiger(String nm) {
		name = nm;
	}

	public void breath() {
		System.out.println(name + "The tiger breath");
	}

	public void eat() {
		System.out.println(name + "The tiger eat");
	}

	public void sleep() {
		System.out.println(name + "The tiger sleep");
	}

	public void run() {
		System.out.println(name + "The tiger run");
	}
}

class Fish implements Animal {
	String name;

	public Fish(String nm) {
		name = nm;
	}

	public void breath() {
		System.out.println(name + "用腮呼吸");
	}

	public void eat() {
		System.out.println(name + "在吃水草");
	}

	public void sleep() {
		System.out.println(name + "在睜著眼睛睡覺");
	}
}

public class AnimalDemo {
	public static void main(String[] args) {
		Animal fish = new Fish("大鯊魚");
		Animal tiger1 = new Tiger("東北虎");
		Mammal tiger2 = new Tiger("華南虎");
		fish.breath();
		fish.eat();
		fish.sleep();
		tiger1.breath();
		tiger1.eat();
		tiger1.sleep();
		((Tiger) tiger1).run();
		tiger2.breath();
		tiger2.eat();
		tiger2.sleep();
		tiger2.run();
	}
}