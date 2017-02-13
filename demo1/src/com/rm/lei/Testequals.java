package com.rm.lei;

public class Testequals {
	public static void main(String[] args) {
		Animal animal1 = new Fish();
		Animal animal2 = new Tiger();
		Animal animal3 = new Fish();
		animal1.age = 12;
		animal1.name = "dingding";
		animal1.type = "dog";
		animal1.weight = 12;
		animal2.age = 12;
		animal2.name = "dingding";
		animal2.type = "dog";
		animal2.weight = 12;
		animal3.age = 12;
		animal2.name = "dongdong";
		animal2.type = "dog";
		animal2.weight = 12;
		System.out.println(animal1.equals(animal2));
		System.out.println(animal1.equals(animal3));
	}

}
