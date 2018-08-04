package day6;

class Person{
	String name = "No name";
	public Person(String nm) {name = nm;}
}

class Employee extends Person{
	String empID = "0000";
	public Employee(String id) {
		super("hi"); // 이거 추가해야 오류 안뜸
		empID = id;
	}
}

public class Test5_4 {
	public static void main(String[] args) {
		Employee e = new Employee("4321");
		System.out.println(e.empID);
	}
}
