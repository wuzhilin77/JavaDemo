package XianCheng;

class Queue {
	int value = 0;
	boolean isEmpty = true;

	public synchronized void put(int v) {
		if (!isEmpty) {
			try {
				System.out.println("生产者等待");
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		value += v;
		isEmpty = false;
		System.out.println("生产者共产数量：" + v);
		notify();
	}

	public synchronized int get() {
		if (!isEmpty) {
			try {
				System.out.println("消费者等待");
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		value--;
		if (value < 1) {
			isEmpty = true;
		}
		System.out.println("消费者消费一个，剩余：" + value);
		notify();
		return value;
	}

}
