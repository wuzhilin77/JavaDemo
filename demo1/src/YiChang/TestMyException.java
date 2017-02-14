package YiChang;

public class TestMyException {
	public static void main(String[] args) {
		MyException mec = new MyException("这是我自定义的异常类");
		System.out.println(mec.getMessage());
		System.out.println(mec.toString());
	}

}
