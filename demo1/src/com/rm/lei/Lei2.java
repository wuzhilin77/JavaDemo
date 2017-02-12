package com.rm.lei;

class Overload {
	void method() {
		System.out.println("无参数方法被调用");
	}

	void method(int a) {
		System.out.println("参数为int方法被调用");
	}

	void method(double b) {
		System.out.println("参数为double方法被调用");
	}

	void method(String c) {
		System.out.println("参数为String方法被调用");
	}
}

public class Lei2 {
	public static void main(String[] args) {
		Overload ov = new Overload();
		ov.method();
		ov.method(4);
		ov.method(4.5D);
		ov.method("a String");

	}

}
