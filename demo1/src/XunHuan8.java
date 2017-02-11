public class XunHuan8 {
	public static void main(String[] args) {
		System.out.println("使用break的例子");
		for (int k = 0; k < 3; k++) {
			System.out.println("第" + (++k) + "次外循环");
			k--;
			for (int i = 0; i < 50; i++) {
				System.out.println("内循环：" + "i=" + i);
				if (i == 3)
					break;
			}
		}
		System.out.println("循环跳出");
	}

}
