package day3;

public class Test2_14 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int num;
		
		while(i < 51) {
			num = (int)(Math.random()*100)+1;
			System.out.printf("%4d",num);
			sum += num;
			
			if(i%6 == 0) {
				System.out.println();
			}
			i++;
			
		}
		System.out.println("\nÇÕ : " + sum);
	}
}