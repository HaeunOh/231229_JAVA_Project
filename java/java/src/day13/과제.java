package day13;
//Product 클래스 생성: 상품을 등록하는 클래스
//상품명, 가격을 멤버변수로 하는 클래스
//상품 추가 메서드
//추가상품을 출력하는 메서드 (toString으로 생성가능)

import java.util.Scanner;

class Product {
	private String name;
	private int price;
	
	
	
	public Product() {}
	
	public Product(String name, int price) {
		this.name=name;
		this.price=price;
			
	}
	
	public void printProduct() {
		System.out.printf("상품명:"+name+"%n가격:"+price+"원");
	}
	
	public void productAdd(String name, int price) {
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
	
}
public class 과제 {

	public static void main(String[] args) {
		//상품을 10개 등록 가능한 배열 생성
		//Scanner를 이용하여 상품 등록받기
		//등록한 상품 출력
		
		Product p = new Product();
//		p.productAdd("김밥", 4000);
//		p.printProduct();
//		System.out.println();
		
//		System.out.println("상품명을 입력하세요 >");
//		String productName=scan.next();
//		System.out.println("상품 가격을 입력하세요>");
//		int productPrice=scan.nextInt();
		
		
		String product[] = new String[10];
		int price[] = new int[10];
		Scanner scan = new Scanner(System.in);
		int cnt=0;
		if(cnt>=10) {
			System.out.println("상품을 더이상 등록하실 수 없습니다.");

		}for(int i=0; i<product.length; i++) {
			System.out.println("상품명을 입력하세요 >");
			String productName=scan.next();
			System.out.println("상품 가격을 입력하세요>");
			int productPrice=scan.nextInt();
			product[i]=productName;
			price[i]=productPrice;
			cnt++;
			
			System.out.println(product[i]+" ");
			System.out.println(price[i]+" ");
		}
		
			
	
		scan.close();
		}
		
		}


