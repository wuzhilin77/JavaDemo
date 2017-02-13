package com.rm.lei;

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

class Dog extends Animal {

}

public class OverloadDemo {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Fish fish = new Fish();
		Dog dog = new Dog();
		tiger.breath();
		fish.breath();
		dog.breath();
	}
}
