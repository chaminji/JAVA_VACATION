package day5;

import java.util.Arrays;

public class Ex3_1 {
	public static void main(String[] args) {
		int[] num;
		num = new int[5];
		int sum=0;
		
		System.out.println("[정렬전]");
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*50)+1;
			System.out.println("num[" + i + "]=" + num[i] + "\t");
			sum+=num[i];
		}
		System.out.println();
		System.out.println("[정렬후]");
		
		Arrays.sort(num);
		for(int i=0; i<num.length; i++) {
			System.out.println("num[" + i + "]=" + num[i] + "\t");
		}
		System.out.println();
		
		System.out.print("\n합=" + sum);
	}
}
