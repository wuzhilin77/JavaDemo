package com.rm.lei;

public class Text {
	public static void main(String[] args) {
		Object[] object = new Object[3];
		Animal animal1 = new Fish();
		Animal animal2 = new Tiger();
		object[0] = animal1;
		object[1] = animal2;
		object[2] = new String("String");
		((Fish) object[0]).swim();
	}
}
