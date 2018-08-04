package day5;

import java.util.Scanner;

public class Test4_05 {
	public static void main(String[] args) {
		
		Emp[] emp = new Emp[3];
		
		emp[0] = new Emp("A111",780000);
		emp[1] = new Emp("B222",450000);
		emp[2] = new Emp("C333",570000);
		
		System.out.println("====================================================================");
		System.out.println("    사번            기본급              수당                  세금                  본봉              등급   ");
		System.out.println("====================================================================");
		
		for(Emp i : emp) {
			System.out.println("  " + i.getEmpno() + "  |  " + i.getGi() + "  |  " + i.getSu() + "  |  " + i.getSe() + "  |  " + i.getBong() + "  |  " + i.getGrad() );
			}
		
	}
}