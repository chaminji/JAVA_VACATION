package day5;

public class Test1 {
	
	private final int id;
	public Test1(int id) {
		this.id =id;
	}
	public void updateId(int newId) {
		//id=newId; 오류 발생
	}
	
	public static void main(String[] args) {
		Test1 mt = new Test1(44);
		mt.updateId(88);
		System.out.println(mt.id);
	}
	
}
