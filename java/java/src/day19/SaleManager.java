package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	//제네릭 클래스 처리
	private ArrayList<Sale<String, Integer>> menu = new ArrayList<>();
	private ArrayList<Sale<String, Integer>> order = new ArrayList<>(); //=> 제네릭 클래스의 존재 이유. 사용할 때마다 필요한 값으로 매개변수를 받을 수 있음
	private int cnt=0;
	
	public void add(Scanner scan) {
		//상품 추가
		System.out.println("상품을 추가합니다 . . .");
		System.out.println("추가할 상품의 이름을 입력하세요.");
		String menuName = scan.next();
		System.out.println(menuName+"의 가격을 입력하세요.");
		int menuPrice = scan.nextInt();
		
		menu.add(new Sale<String, Integer>(menuName,menuPrice));
		System.out.println("상품 등록이 완료되었습니다.");
		
		
	}

	public void menuPrint() {
		//상품 리스트 프린트
		if(menu.isEmpty()) {
			System.out.println("등록된 메뉴가 없습니다.");
		}
		System.out.println("━━━━━━━ menu ━━━━━━━━");
		for(int i=0; i<menu.size(); i++) {
			System.out.println(menu.get(i));
			}
		System.out.println();
		}
	

	public void orderPick(Scanner scan) {
		//상품 주문
		//입력 받는 값은 제품명, 수량
		//제품명 가격*수량
		
		
		System.out.println("---menu---");
		for(int i=0; i<menu.size(); i++) {
			System.out.println(menu.get(i));
		}
		System.out.println();
		System.out.println("주문하실 메뉴 이름을 입력하세요 >");
		String orderName = scan.next();
		for(int i=0; i<menu.size(); i++) {
			if(orderName.equals(menu.get(i).getMenu())) {
				System.out.println("주문 수량을 입력하세요.");
				int ea =scan.nextInt();
				order.add(new Sale<String, Integer>(orderName, ea*(menu.get(i).getPrice())));
				System.out.println("주문이 완료되었습니다.");
				return;
			}
		
		}
		System.out.println("일치하는 메뉴가 없습니다.");
	}

	public void orderPrint() {
		int sum=0;
		//주문 내역 프린트
		System.out.println("---order list---");
		for(int i=0; i<order.size(); i++) {
			System.out.println(order.get(i));
			sum+=order.get(i).getPrice();
			
		}
		System.out.println("총 지불 금액: "+sum+"원");
		
	
		
	}
	
	public int orderSearch(String name) {
		//name 주문 메뉴
		int index=-1;
		for(int i=0; i<order.size(); i++) {
			if(order.get(i).getMenu().equals(name)) {
				index=i;
				return index;
			}
		}
		return index;
	}
	
	

}
