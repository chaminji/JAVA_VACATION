package day2;

public class BinaryOperation {
	public static void main(String args[]) {
		char c1 = 'a';
		
		//char c2 = c1 + 1;
		//c1 + 1의 결과는 int형이 된다. int형을 char에 대입하면 에러가 발생한다.

		char c2 = (char) ((char)c1 + 1);  
		
//		char c2 = 'a' + 1;
		System.out.println(c2);
	}
}
