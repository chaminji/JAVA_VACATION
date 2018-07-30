package day3;
import java.util.Scanner;

public class Test2_15 {
	public static void main(String[] args) {
		
		String credit;
		
		System.out.print("점수를 입력하세요(중간고사, 기말고사, 레포트, 출석점수) : ");
		
		Scanner scan = new Scanner(System.in);
		int mid = scan.nextInt();
		int fin = scan.nextInt();
		int report = scan.nextInt();
		int come = scan.nextInt();
		
		System.out.println("-------결과입니다-------");
		System.out.println("중간고사 : " + mid);
		System.out.println("기말고사 : " + fin);
		System.out.println("과제점수 : " + report);
		System.out.println("출석점수 : " + come);
		
		float score = (float) (((mid + fin)/2*0.6) + report*0.2 + come*0.2);
		System.out.printf("\n성적 : %.2f\n",score);
		
		if(score>=90) {credit = "A";}
		else if(score>=80) {credit = "B";}
		else if(score>=70) {credit = "C";}
		else if(score>=60) {credit = "D";}
		else {credit = "F";}
		System.out.println("학점은 : " + credit);
		
		switch(credit) {
			case "A" : System.out.println("평가 : excellent");
			break;
			case "B" : System.out.println("평가 : excellent");
			break;
			case "C" : System.out.println("평가 : good");
			break;
			case "D" : System.out.println("평가 : good");
			break;
			case "F" : System.out.println("평가 : poor");
			break;
		}
		
	}
}