package KeLong;

class Addr{
	String country;
	String province;
	String city;
	Addr(String country,String province,String city){
		this.country=country;
		this.province=province;
		this.city=city;
	}
}
class Human1 implements Cloneable {
	String name;
	int age;
	Addr addr;

	Human1(String name, int age, Addr addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	public Object clone() {
		Human1 h = null;
		try {
			h = (Human1) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return h;
	}
}
public class TestClone{
	public static void main(String[] args){
		Addr addr=new Addr("中国","北京","朝阳区");
		Human1 zhangsan=new Human1("zhangsan",24,addr);
		Human1 lisi=(Human1)zhangsan.clone();
		System.out.println("张三的地址:");
		System.out.println(zhangsan.addr.country+zhangsan.addr.province+zhangsan.addr.city);
		System.out.println("李四的地址:");
		System.out.println(lisi.addr.country+lisi.addr.province+lisi.addr.city);
		lisi.addr.country="中国";
		lisi.addr.province="山东";
		lisi.addr.city="青岛";
		System.out.println("修改李四的地址为：中国山东青岛");
		System.out.println("张三的地址:");
		System.out.println(zhangsan.addr.country+zhangsan.addr.province+zhangsan.addr.city);
		System.out.println("李四的地址:");
		System.out.print(lisi.addr.country+lisi.addr.province+lisi.addr.city);
		
	}
}