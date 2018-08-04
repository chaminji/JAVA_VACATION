package day6;

class Simple{
	public int value;
	public void calculate() { 
		value += 7; 
		System.out.println("value+=7 : " + value);
	}
}

public class Test5_6 extends Simple{
	public void calculate() {
		value -= 3; 
		System.out.println("value-=3 : " + value);
		}
	
	public void calculate(int m) {
		calculate(); 
		System.out.println("calculate(); : " + value);
		super.calculate(); 
		System.out.println("super.calculate(); : " + value);
		value*=m; 
		System.out.println("value*=m : " +value);
	}
	
	public static void main(String[] args) {
		Test5_6 so = new Test5_6();
		so.calculate(2);
		System.out.println("Value is : " + so.value);
	}
}