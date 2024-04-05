package std;

import java.util.Scanner;

public class StdMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//매니저를 호출하기 위한 객체
		StdManager m = new StdManager();
	
		
		int menu = 0;
		do {
			//메뉴넣기
			System.out.println("【            𝗦𝗧𝗨𝗗𝗘𝗡𝗧 𝗠𝗔𝗡𝗔𝗚𝗘𝗥           】");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("  1. 학생 추가 | 2. 학생 출력 | 3. 학생 검색 ");
			System.out.println("  4. 학생 수정 | 5. 학생 삭제 | 6. 과목 추가 ");
			System.out.println("  7. 과목 수정 | 8. 과목 삭제 | 9.  종  료  ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println();
			System.out.println("메뉴 선택 》》》");
			
			menu = scan.nextInt();
			
			//메뉴에 따른 분기 구현
			switch(menu) {
			case 1: m.addStd(scan); break;
			case 2: m.printStd();break;
			case 3: m.searchStd(scan); break;
			case 4: m.modStd(scan); break;
			case 5: m.delStd(scan); break;
			case 6: m.addSub(scan); break;
			case 7: m.modSub(scan); break;
			case 8: m.delSub(scan); break;
			case 9: break;
			
			default:
				System.out.println("잘못된 메뉴입니다.");
			
			}
			
			
		}while(menu!=9);
		System.out.println("프로그램이 종료되었습니다.");
		
		
		scan.close();
	

	}

}
