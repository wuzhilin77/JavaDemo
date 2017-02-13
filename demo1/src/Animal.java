public class Animal {
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

	public String toString() {
		String returnString = null;
		returnString = "名字：" + this.name + "\n" + "种类：" + this.type + "\n"
				+ "年龄：" + this.age + "\n" + "体重：" + this.weight;
		return returnString;
	}
}
