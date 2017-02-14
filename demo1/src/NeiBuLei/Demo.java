package NeiBuLei;

class FatherClass{
	public String str1="父类的public属性";
}
class SonClass extends FatherClass{
	void print(){
		SonClass son=new SonClass();
		System.out.println("在子类的方法中：");
		System.out.println(son.str1);
	}
}
public class Demo{
	public static void main(String[] args){
		SonClass son=new SonClass();
		son.print();	
	}
}