package day1;

import java.util.Scanner;

public class Test2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �̸� ���� Ű�� �Է� : ");
		String country = scan.next();
		String name = scan.next();
		int age = scan.nextInt();
		float height = scan.nextFloat();
		
		System.out.println("���� ������ " + country + "�̸� �̸��� " + name + "�Դϴ�" );
		System.out.println("���̴� " + age + "���̸� Ű�� " + height + "�Դϴ�");
	}
}
