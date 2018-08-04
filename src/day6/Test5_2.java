package day6;

public class Test5_2 {
	
}

class A{
	private int i;
	protected char c;
	public int f;
	private void testA() {
		i = 3;
		c = 'a';
		f = 1;
	}
}

class B extends A {
	int j;
	void testB() {
		j = 6;
		//i = 9; 오류발생
		c = 'k';
		
		f = 89;
		//testA(); 오류발생
	}
}