package XianCheng;

public class ThreadCommunication {
	public static void main(String[] args) {
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);

		c.start();
		p.start();
	}
}
