package day2;

public class Test2_08 {
	public static void main(String args[]) {
		int num = 27890;
		int a = 1; // 0x0001 0000 0000 0000 0001
		
		System.out.println((num>>>7) & a);
		System.out.println((num>>>8) & a);
	}
}