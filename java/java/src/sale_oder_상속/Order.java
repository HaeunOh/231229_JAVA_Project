package sale_oder_상속;

public class Order extends Sale {
	
	private int cnt;
	private int total;


	//public Order() {}
	//public Order(String name, int price, int cnt) {
		//부모의 set 사용
		//super.setName(name);
		//super.setPrice(price); 
		
		//부모의 생성자 호출
		//super(name,price);
		//this.cnt=cnt;
		//this.total=price*cnt;
	//}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public int getPrice() {
		return super.getPrice();
	}

	@Override
	public void setPrice(int price) {
		super.setPrice(price);
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	

}
