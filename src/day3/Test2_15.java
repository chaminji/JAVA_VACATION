package day3;
import java.util.Scanner;

public class Test2_15 {
	public static void main(String[] args) {
		
		String credit;
		
		System.out.print("������ �Է��ϼ���(�߰����, �⸻���, ����Ʈ, �⼮����) : ");
		
		Scanner scan = new Scanner(System.in);
		int mid = scan.nextInt();
		int fin = scan.nextInt();
		int report = scan.nextInt();
		int come = scan.nextInt();
		
		System.out.println("-------����Դϴ�-------");
		System.out.println("�߰���� : " + mid);
		System.out.println("�⸻��� : " + fin);
		System.out.println("�������� : " + report);
		System.out.println("�⼮���� : " + come);
		
		float score = (float) (((mid + fin)/2*0.6) + report*0.2 + come*0.2);
		System.out.printf("\n���� : %.2f\n",score);
		
		if(score>=90) {credit = "A";}
		else if(score>=80) {credit = "B";}
		else if(score>=70) {credit = "C";}
		else if(score>=60) {credit = "D";}
		else {credit = "F";}
		System.out.println("������ : " + credit);
		
		switch(credit) {
			case "A" : System.out.println("�� : excellent");
			break;
			case "B" : System.out.println("�� : excellent");
			break;
			case "C" : System.out.println("�� : good");
			break;
			case "D" : System.out.println("�� : good");
			break;
			case "F" : System.out.println("�� : poor");
			break;
		}
		
	}
}