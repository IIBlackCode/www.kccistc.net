class MyClass{
	public static void messge() {
		System.out.println("메세지 출력");
	}
	public static String message2() {
		return "안녕하세요";
	}
}
public class Test1 {
	public static void messge() {
		System.out.println("메세지 출력");
	}
	public static String message2() {
		return "안녕하세요";
	}
	public static void main(String[] args) {
		messge();
		String msg = message2();
		System.out.println(msg);
		MyClass.messge();
		String msg2 = MyClass.message2();
		System.out.println(msg2);
	}
}
