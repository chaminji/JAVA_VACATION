package day1;

import java.util.Scanner;

public class Test3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int tot = 0;
		float avg = 0;
		
		System.out.println("이름 국어 영어 수학");
		
		String name = scan.next();
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int mat = scan.nextInt();
		
		tot = kor + eng + mat;
		avg = tot/3;
		
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor + "     영어 : " + eng + "     수학 : " + mat );
		System.out.println("총점 : " + tot + "     평균 : " + avg);
	}
}
