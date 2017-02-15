package XianCheng;

public class ThreadSleep {
	public static void main(String[] args) {
		SubThread st = new SubThread("SubThread");
		st.start();
	}

}

class SubThread extends Thread {
	SubThread() {
	}

	SubThread(String Name) {
		super(Name);
	}

	public void run() {
		for (int count = 1, row = 1; row < 10; row++, count++) {
			for (int i = 0; i < count; i++) {
				System.out.print("*");
			}
			try {
				Thread.sleep(1000);
				System.out.print("\t wait......");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
		}
	}
}