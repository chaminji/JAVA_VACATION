package day6;

public class Homework {
	public static void main(String[] args) {
		int sum = 0;
		int totalmoney = 0;
		
		Receipt[] receipt = new Receipt[5];
		receipt[0] = new Receipt("�޷γ�",500,1);
		receipt[1] = new Receipt("������",1000,2);
		receipt[2] = new Receipt("������",500,4);
		receipt[3] = new Receipt("���Դ�",5000,1);
		receipt[4] = new Receipt("������",1200,2);
		
		for(Receipt i : receipt) {
			sum += i.getCnt();
			totalmoney += i.getMoney();
		}
		
		System.out.println("==============================");
		System.out.println("��ǰ��              �ܰ�         ����       �ݾ�  ");
		System.out.println("==============================");
		
		for(Receipt i : receipt) {
			System.out.printf("%s             %-4d %5d %7d\n",i.getArticle(),i.getCost(),i.getCnt(),i.getMoney());
		}
		
		System.out.println("                            �հ� ���� : " + sum);
		System.out.println("                            �հ� �ݾ� : " + totalmoney);
	}
}

//��� ���� / ��� �߰�
//������ ��� ���α׷�