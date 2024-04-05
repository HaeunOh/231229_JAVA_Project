package sale_oder_상속;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	private ArrayList<Sale<String, Integer>> menu = new ArrayList<>();
	private ArrayList<Order> order = new ArrayList<>();

	
	public void addMenu(Scanner scan) {
		//메뉴 추가: 관리자
		System.out.println("추가할 메뉴 이름을 입력하세요.");
		String name = scan.next();
		System.out.println("추가할 메뉴의 가격을 입력하세요.");
		int price = scan.nextInt();
		
		Sale<String,Integer> s = new Sale <String,Integer>(name,price);
		this.menu.add(s);
		System.out.println("메뉴 추가가 완료되었습니다.");
		
		
	}

	public void delMenu(Scanner scan) {
		//메뉴 삭제: 관리자
		System.out.println("삭제할 메뉴 이름을 입력하세요.");
		String delMenu=scan.next();
		for(int i=0; i<menu.size(); i++) {
			if(delMenu.equals(menu.get(i).getName())){
				menu.remove(i);
				System.out.println("해당 메뉴가 삭제되었습니다.");
				return;
			}	
		}
		System.out.println("일치하는 메뉴가 없습니다.");
	}

	public void modMenu(Scanner scan) {
		//메뉴 수정, 가격만: 관리자
		System.out.println("단가 수정할 메뉴 이름을 입력하세요.");
		String modMenu=scan.next();
		for(int i=0; i<menu.size(); i++) {
			if(modMenu.equals(menu.get(i).getName())){
				System.out.println("수정할 가격을 입력하세요.");
				int modPrice=scan.nextInt();
				menu.get(i).setPrice(modPrice);
				System.out.println("수정이 완료되었습니다.");
				return;
				}
			}
		System.out.println("일치하는 메뉴가 없습니다.");
	}

	public void menuPrint() {
		//추가한 메뉴 전부 프린트하기
		System.out.println("━━━━━━━━━━━━━━━< m e n u >━━━━━━━━━━━━━━");
		if(menu.size()==0) {
			System.out.println("! 등록된 메뉴가 없습니다 !");
			System.out.println();
		}
		for(int i=0; i<menu.size(); i++) {
			System.out.println(menu.get(i).toString());
		}
		
	}

	public void orderPick(Scanner scan) {
		//주문하기: 상품명, 개수 입력받기
		menuPrint();
		System.out.println("주문하실 상품을 입력하세요.");
		String orderName=scan.next();
		for(int i=0; i<menu.size(); i++) {
			int ProductPrice = menu.get(i).getPrice();
			String ProductMenu = menu.get(i).getName();
			if(orderName.equals(menu.get(i).getName())){
				System.out.println("주문하실 상품 개수를 입력하세요.");
				int ea = scan.nextInt();
				int index=orderSearch(orderName);
				if(index!=-1) {
					int price=order.get(index).getPrice();
					order.get(index).setCnt(ea+(order.get(index).getCnt()));
					order.get(index).setTotal(price+(order.get(index).getTotal()));
					//order.get(index).setPrice(price+(ProductPrice*ea));
					return;
					
				}
				
				Order o = new Order();
				o.setName(orderName);
				o.setCnt(ea);
				o.setPrice(menu.get(i).getPrice());
				o.setTotal(o.getCnt()*o.getPrice());
				this.order.add(o);
				System.out.println("주문이 완료되었습니다.");
			}
		}
	}
	
	public int orderSearch(String orderName) {
		//name=주문 메뉴
		int index=-1;
		for(int i=0; i<order.size(); i++) {
			if(order.get(i).getName().equals(orderName)) {
				index=i;
				System.out.println(index);
				return index;
			}	
		}
		return index;
	}

	public void orderPrint() {
		//상품명과 연결된 가격*개수 프린트 : 영수증처럼
		
		int sum=0;
		System.out.println("━━━━━━━━━━━< r e c e i p t >━━━━━━━━━━━━");
		System.out.println("상품명       단가          수량           금액");
		System.out.println();
		for(int i=0; i<order.size(); i++) {
			System.out.printf(order.get(i).getName()+" |   "+order.get(i).getPrice()+"원 |         "+ order.get(i).getCnt()+"    |"+order.get(i).getTotal()+"원%n");
			
			sum+=order.get(i).getTotal();
			
		}	
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("받을 금액                          "+sum+"원");
		System.out.println();
	}

}
