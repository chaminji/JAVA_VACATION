package day2;

public class Test2_09 {
	public static void main(String args[]) {
		int egg = 456;
		int num = 12;
		int box = (egg%num==0 ? egg/num : egg/num + 1);
		
		System.out.println("�ް� " + egg + "���� " + num + "���� ���� �� �ִ� ������ ���� " + box + "��");
	}
}
