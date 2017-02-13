public class ParamTransfer {
	public int money;

	void amethod(int i) {
		System.out.println("方法得到的i的值为：" + i);
		i = i * 5;
		System.out.println("方法执行语句i=i*5后i的值为：" + i);
		System.out.println("money的值为：" + this.money);
	}

	public static void main(String[] args) {
		ParamTransfer pt = new ParamTransfer();
		pt.money = 100;
		pt.amethod(pt.money);
	}

}
