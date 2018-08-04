package day5;

import java.util.Scanner;

public class Emp {

	Scanner scan = new Scanner(System.in);
	private String empno;
	private int gi;
	private double se;
	private double su;
	private double bong;
	private String grad;
	
	public Emp() {
		super();
	}
	 
	public Emp(String empno, int gi) {
		super();
		this.empno = empno;
		this.gi = gi;
	}
	
	String getEmpno() {
		return empno;
	}
	
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	
	int getGi(){
		return gi;
	}
	
	public void setGi(int gi) {
		this.gi = gi;
	}
	
	double getSe() {
		se = gi * 0.15;
		return se;
	}
	
	double getSu() {
		su = gi * 0.2;
		return su;
	}
	
	double getBong() {
		bong = gi + su - se;
		return bong;
	}
	
	String getGrad() {
		if(bong>=500000)
		{grad = "관리자";}
		else {grad = "영업";}
		return grad;
	}		
}