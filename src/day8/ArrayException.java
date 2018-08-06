package day8;

public class ArrayException {
	public static void main(String[] args) {
		String[] animal = new String[2];
		
		try {
			animal[0] = "dog";
			System.out.println("동물1 : " +  animal[0]);
			animal[1] = "cat";
			System.out.println("동물2 : " +  animal[1]);
			animal[2] = "rabbit";
			System.out.println("동물3 : " + animal[2]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열 참조 에러 발생");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("시스템 종료");
		}
	}
}