package day2;

public class BinaryOperation {
	public static void main(String args[]) {
		char c1 = 'a';
		
		//char c2 = c1 + 1;
		//c1 + 1�� ����� int���� �ȴ�. int���� char�� �����ϸ� ������ �߻��Ѵ�.

		char c2 = (char) ((char)c1 + 1);  
		
//		char c2 = 'a' + 1;
		System.out.println(c2);
	}
}
