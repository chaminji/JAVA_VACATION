package day2;

public class Test2_09 {
	public static void main(String args[]) {
		int egg = 456;
		int num = 12;
		int box = (egg%num==0 ? egg/num : egg/num + 1);
		
		System.out.println("달걀 " + egg + "개를 " + num + "개씩 담을 수 있는 상자의 수는 " + box + "개");
	}
}
