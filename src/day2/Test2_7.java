package day2;

public class Test2_7 {
	public static void main(String args[]) {
		int money = 65430;
		
		System.out.println("만원 : " + money/10000);
		money = money % 10000;
		System.out.println("천원 : " + money/1000);
		money = money % 1000;
		System.out.println("백원 : " + money/100);
		money = money % 100;
		System.out.println("십원 : " + money/10);
	}
}
