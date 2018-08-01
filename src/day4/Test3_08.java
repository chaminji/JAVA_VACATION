package day4;

public class Test3_08 {
	public static void main(String[] args) {
		int[] a = {90,80,50,70,65,90,100,43,55,87};
	
		for(int i=0; i<10; i++) {
			System.out.printf("%3dÁ¡ : ",a[i]);
		
			for(int j=0; j<(int)(a[i]/10); j++) {
				System.out.print("¡á ");
			}
			System.out.println();
		}
	}
}