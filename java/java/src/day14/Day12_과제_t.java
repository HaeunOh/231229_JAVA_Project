package day14;

import java.util.Scanner;

//product 클래스 생성: 상품을 등록하는 클래스
//상품명, 가격을 멤버변수로 생성
//상품추가 메서드
//상품출력 메서드 (toString으로 생성가능)
class Product {
	private String name;
	private int price;
	
	//생성자
	public Product() {}
	public Product(String name, int price) {
		this.name=name;
		this.price=price;
	 }
	
	//메서드 => 매번 호출 가능
	public void insertProduct(String name, int price) {
		this.name=name;
		this.price=price;
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
	@Override
	public String toString() {
		return "상품명:" + name + " / 가격:" + price + "원";
	}
	
	
	
}


public class Day12_과제_t {
	public static void main(String[] args) {
		//상품을 10개 등록 가능한 배열생성
		//스캐너를 이용하여 상품을 등록받기
		//등록한 상품 출력
		
		//상품을 등록하시겠습니까? (y/n) //y->계속 등록 n->그만하기
		//n을 누르면 등록한 상품이 출력되게
		
//		int cnt=0;
//		Product p = new Product("피자",15000);
//		menu[cnt]=p;
//		cnt++;
//		
//		Product p1 = new Product();
//		p1.insertProduct("콜라", 2000);
//		menu[cnt]=p1;
//		cnt++;
//		
//		for(int i=0; i<cnt; i++) {
//			System.out.println(menu[i]);
//		}
		
// -> 클래스에서 만든 메서드를 이용해서 상품 등록, 출력하는 방법
		
		Scanner scan = new Scanner(System.in);
		// Product 클래스를 담을 수 있는 배열 10칸을 준비
		Product[] menu = new Product[10];
		
		System.out.println("상품을 등록하시겠습니까? ( y / n )");
		String input = scan.next();
		
		int cnt=0;
		while(!input.equals("n")) { //char로 인풋받을경우.. c=!n으로 조건주면됨
			
			if(input.equals("y")) {
				System.out.println("상품명을 입력하세요.");
				Product i=new Product();
				String name=scan.next();
				System.out.println("상품의 가격을 입력하세요.");
				int price=scan.nextInt();
				i.insertProduct(name, price);
				menu[cnt]=i;
				cnt++;
				System.out.println("상품을 등록하시겠습니까? ( y / n )");
				input=scan.next();
				
			}else {
				if(input.equals("n")) {
					System.out.println("상품 등록을 종료합니다.");
				}else {
					System.out.println("잘못된 입력값입니다.");	
					break;
				}
			}
		}
		
	
		System.out.println("---등록한 상품 내역---");
		for(int i=0; i<cnt; i++) {
			System.out.printf(menu[i]+"%n");
		}
		
		
		
		
		
		scan.close();
	}

}
