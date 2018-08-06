package day8;

public class MyExceptionTest {
	static void callException() throws MyException{
		throw new MyException();
	}
	
	public static void main(String[] args) {
		try {
			callException();
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("시스템종료");
		}
	}
}
