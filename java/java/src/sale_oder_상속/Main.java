package sale_oder_상속;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* menu
		 *1. 메뉴 추가 | 2. 메뉴 삭제 | 3. 메뉴 수정(가격)
		 *4. 메뉴 보기 | 5. 주문  | 6. 주문 내역 출력 | 7. 종료
		 * */
	
		Scanner scan = new Scanner(System.in);
		SaleManager sm = new SaleManager();
		int menu=0;
		do {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("1. 메뉴 추가 | 2. 메뉴 삭제 | 3. 메뉴 단가 수정 ");
			System.out.println("4. 메뉴 보기 | 5. 주문하기  | 6. 주문 내역 출력 ");
			System.out.println("7. 프로그램 종료");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("선택 >");
			
			menu=scan.nextInt();
			
			switch (menu) {
			case 1: sm.addMenu(scan); break;
			case 2: sm.delMenu(scan); break;
			case 3: sm.modMenu(scan); break;
			case 4: sm.menuPrint(); break;
			case 5: sm.orderPick(scan); break;
			case 6: sm.orderPrint(); break;
			case 7: break;
			

			default: System.out.println("잘못된 메뉴입니다.");
				break;
			}
		
		} while (menu!=7);
			System.out.println("프로그램 종료.");
		
		
		scan.close();
	}

}
