package day2;

public class ConnectOperation2 {
	public static void main(String args[]) {
		String s = "Hello " + "Beautiful " + "world";
		String t = (new StringBuffer("Hello Beautiful ")).append("world").toString();
		System.out.println(s);
		System.out.println(t);
	}
}

//멀티스레드환경 : StringBuffer
//단일스레드환경 : StringBuilder