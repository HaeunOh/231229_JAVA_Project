package studentManager2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//메뉴 처리
		/* 학생등록, 학생리스트출력, 학생검색, 수강신청, 수강철회, 종료 
		 *
		 *객체를 생성하는 것은 항상 미리 해놓고 메서드 호출
		 *
		 * */
		
		Scanner scan = new Scanner(System.in);
		//매니저를 호출하기 위한 객체
		Manager sm = new Manager();
		int menu = 0;
		do {
			//메뉴넣기
			System.out.println("--menu--");
			System.out.println("1. 학생등록 | 2. 학생 리스트 출력 | 3. 학생 검색");
			System.out.println("4. 수강신청 | 5. 수강철회       | 6. 종료");
			System.out.println();
			System.out.println("메뉴 선택 >>");
			
			menu = scan.nextInt();
			
			//메뉴에 따른 분기 구현
			switch(menu) {
			case 1: sm.insertStudent(scan); break;
			case 2: sm.printStudent();  break;
			case 3: sm.serchStudent(scan); break;
			case 4: sm.registerSubject(scan); break;
			case 5:sm.deleteSubject(scan); break;
			case 6: break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			
			}
			
			
		}while(menu!=6);
		System.out.println("종료");
		
		
		scan.close();

	}

}
