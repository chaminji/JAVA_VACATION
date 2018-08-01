package day4;

public class Test3_15 {
	public static void main(String[] args) {
		int[][]A = {{5,7,10,4},{2,5,3,6}};
		int[][]B = {{4,1,1},{-6,7,5},{9,9,4},{2,5,5}};
		int[][]RES = new int [2][3];
		
		/*
		 * 5 7 10 4		4 1 1
		 * 2 5  3 6	   -6 7 5
		 * 			    9 9 4
		 * 				2 5 5
		 */
		
		for(int i=0; i<A.length; i++) {  //2
			for(int k=0; k<B[i].length; k++) {  //3
				for(int j=0; j<A[i].length; j++) {  //4
					RES[i][k] += A[i][j]*B[j][k];
				}
				System.out.printf("%6d",RES[i][k]);
			}
			System.out.println();
		}
	}
}