package YiChang;

public class ThrowsDemo {
	static void method() throws NullPointerException,
			IndexOutOfBoundsException, ClassNotFoundException {
		String str = null;
		int strLength = 0;
		strLength = str.length();
		System.out.println(strLength);
	}

	public static void main(String[] args) {
		try {
			method();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException异常");
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException异常");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException异常");
			e.printStackTrace();
		}
	}

}
