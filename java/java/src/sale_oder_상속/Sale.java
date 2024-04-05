package sale_oder_상속;

public class Sale<H,V> {
	private String name;
	private int price;
	
	public Sale() {}
	public Sale(String name) {
		this.name=name;
	}
	public Sale(String name,int price) {
		this.name=name;
		this.price=price;
	}
	
	
	@Override
	public String toString() {
		return name + "---▷ " + price + "원";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
