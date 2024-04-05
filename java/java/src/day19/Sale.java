package day19;

public class Sale<K,V> {
	//멤버변수 menu, price =K,V 제너릭 변수로 선언, K자리에 int 값 입력하면 모든 K가 int형으로 바뀜.
	
	private K menu;
	private V price;
	
	public Sale() {}
	public Sale(K menu, V price) {
		this.menu=menu;
		this.price=price;
		
	}
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
		
	}
	@Override
	public String toString() {
		return  menu + " / 가격: " + price + "원";
	}
	
}
