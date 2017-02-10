public class ZiZengJian3 {
	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		int x = 2 * ++a;
		int y = 2 * b++;
		System.out.println("自增运算符前缀运算后 a=" + a + "表达式x=" + x);
		System.out.println("自增运算符后缀运算后 b=" + b + "表达式y=" + y);
	}
}
