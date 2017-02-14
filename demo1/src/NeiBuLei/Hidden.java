package NeiBuLei;

class Father {
	String str = "父类的成员变量";
}

class Son extends Father {
	String str = "子类的Str成员变量";

	void show() {
		System.out.println(super.str);
	}
}

public class Hidden {
	public static void main(String[] args) {
		Son son = new Son();
		System.out.println("调用隐藏的父类成员变量");
		son.show();
	}

}
