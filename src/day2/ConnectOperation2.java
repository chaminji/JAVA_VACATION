package day2;

public class ConnectOperation2 {
	public static void main(String args[]) {
		String s = "Hello " + "Beautiful " + "world";
		String t = (new StringBuffer("Hello Beautiful ")).append("world").toString();
		System.out.println(s);
		System.out.println(t);
	}
}

//��Ƽ������ȯ�� : StringBuffer
//���Ͻ�����ȯ�� : StringBuilder