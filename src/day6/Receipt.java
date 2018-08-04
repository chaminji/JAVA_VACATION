package day6;

public class Receipt {
		
	private String article;
	private int cost;
	private int cnt;
	private int money;
	
	public Receipt() {
		super();
	}
		 
	public Receipt(String article, int cost, int cnt) {
		super();
		this.article = article;
		this.cost = cost;
		this.cnt = cnt;
	}
	
	String getArticle() {
		return article;
	}
	
	public void setArticle(String article) {
		this.article = article;
	}
	
	int getCost(){
		return cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	int getCnt() {
		return cnt;
	}
	
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	int getMoney() {
		money = cost*cnt;
		return money;
	}	
}