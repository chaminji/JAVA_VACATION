package day1;

import java.util.Scanner;

public class Test3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int tot = 0;
		float avg = 0;
		
		System.out.println("�̸� ���� ���� ����");
		
		String name = scan.next();
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int mat = scan.nextInt();
		
		tot = kor + eng + mat;
		avg = tot/3;
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kor + "     ���� : " + eng + "     ���� : " + mat );
		System.out.println("���� : " + tot + "     ��� : " + avg);
	}
}
