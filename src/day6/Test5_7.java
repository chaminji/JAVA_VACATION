package day6;

class Fish{
}
class Perch extends Fish{
}
class Walleye extends Perch{
}

public class Test5_7 {
	public static void main(String[] args) {
		Fish f = new Perch();
		Walleye w = new Walleye();
		if(f instanceof Perch)
			System.out.println("f-p");
		if(w instanceof Fish)
			System.out.println("w-f");
	}
}
