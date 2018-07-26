package day1;

import java.util.Scanner;

public class Test2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국적 이름 나이 키를 입력 : ");
		String country = scan.next();
		String name = scan.next();
		int age = scan.nextInt();
		float height = scan.nextFloat();
		
		System.out.println("나의 국적은 " + country + "이며 이름은 " + name + "입니다" );
		System.out.println("나이는 " + age + "살이며 키는 " + height + "입니다");
	}
}
