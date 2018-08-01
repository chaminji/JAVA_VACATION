package day4;

import java.util.Scanner;

public class Test3_13 {
	public static void main(String[] args) {
		System.out.print("정답을 입력하세요(10개) : ");
		Scanner scan = new Scanner(System.in);
		int[] ranswer = new int[10];
		int[][] answer = {{1,3,2,4,3,1,4,2,2,1},{3,2,4,2,2,1,1,3,4,1},{2,4,3,2,1,2,1,3,3,4},{2,3,3,1,1,3,2,2,4,4},{3,1,1,2,4,1,2,3,1,3}};
		int count = 0;
		
		for(int i=0; i<10; i++) {
			ranswer[i] = scan.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			System.out.printf("학생%2d : ",i+1);
			for(int j=0; j<10; j++) {
				System.out.print(answer[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("");
		
		for(int i=0; i<5; i++) {
			count = 0;
			System.out.printf("학생%d ",i+1);
			for(int j=0; j<10; j++) {
				if(answer[i][j] == ranswer[j]) {count++;}
			}
			System.out.printf("학생 %d의 점수 : %d점\n",i+1,count);
		}
	}
}