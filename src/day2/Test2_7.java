package day2;

public class Test2_7 {
	public static void main(String args[]) {
		int money = 65430;
		
		System.out.println("���� : " + money/10000);
		money = money % 10000;
		System.out.println("õ�� : " + money/1000);
		money = money % 1000;
		System.out.println("��� : " + money/100);
		money = money % 100;
		System.out.println("�ʿ� : " + money/10);
	}
}
