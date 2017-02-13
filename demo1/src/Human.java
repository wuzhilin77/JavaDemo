
class Human {
	String name;
	String sex;
	int age;
	String addr;

	public Human() {
		name = null;
		age = 0;
		sex = null;
		addr = null;
	}

	public Human(String hName, String hSex, int hAge, String hAddr) {
		name = hName;
		sex = hSex;
		age = hAge;
		addr = hAddr;
	}

	void work() {
		System.out.println("我在工作");
	}

	void eat() {
		System.out.println("我在吃饭");
	}

}
