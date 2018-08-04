package day6;

public class Homework {
	public static void main(String[] args) {
		int sum = 0;
		int totalmoney = 0;
		
		Receipt[] receipt = new Receipt[5];
		receipt[0] = new Receipt("메로나",500,1);
		receipt[1] = new Receipt("돼지콘",1000,2);
		receipt[2] = new Receipt("빠삐코",500,4);
		receipt[3] = new Receipt("투게더",5000,1);
		receipt[4] = new Receipt("설레임",1200,2);
		
		for(Receipt i : receipt) {
			sum += i.getCnt();
			totalmoney += i.getMoney();
		}
		
		System.out.println("==============================");
		System.out.println("상품명              단가         수량       금액  ");
		System.out.println("==============================");
		
		for(Receipt i : receipt) {
			System.out.printf("%s             %-4d %5d %7d\n",i.getArticle(),i.getCost(),i.getCnt(),i.getMoney());
		}
		
		System.out.println("                            합계 수량 : " + sum);
		System.out.println("                            합계 금액 : " + totalmoney);
	}
}

//재고 관리 / 재고 추가
//영수증 찍는 프로그램