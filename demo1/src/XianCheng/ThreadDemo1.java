package XianCheng;

public class ThreadDemo1 extends Thread {
	ThreadDemo1() {
	}

	ThreadDemo1(String szName) {
		super(szName);
	}

	public void run() {
		for (int count = 1, row = 1; row < 10; row++, count++) {
			for (int i = 0; i < count; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] argv) {
		ThreadDemo1 td = new ThreadDemo1();
		td.start();
	}

}
