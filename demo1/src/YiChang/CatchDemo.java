package YiChang;

public class CatchDemo {
	public static void main(String[] args) {
		try {
			int a = 15 / 0;
		} catch (ArithmeticException e) {
			System.out.println("捕获ArithmeticException异常");
		} catch (Exception e) {
			System.out.println("捕获Exception异常");
		}
	}

}
