package day6;

class A1{
	A1(){System.out.println("A1_Default");}
}

class A2 extends A1{
	A2(String type){ System.out.println("A2_"+type); }
}

public class Test5_5 extends A2{
	Test5_5(){
		super("super");
		new A2("new");
	}
	public static void main(String[] args) {
		new Test5_5();
	}
}
