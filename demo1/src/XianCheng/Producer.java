package XianCheng;


public class Producer extends Thread {
	Queue q;

	Producer(Queue q) {
		this.q = q;
	}

	public void run() {
		for (int i = 1; i < 5; i++) {
			q.put(i);
		}
	}

}

class Consumer extends Thread {
	Queue q;

	Consumer(Queue q) {
		this.q = q;
	}

	public void run() {
		while (true) {
			q.get();
		}
	}
}