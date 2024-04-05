package studentManager;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int menu=0;
		Manager m=new Manager();
		
		do {
		System.out.println(" ╔═════           ═════╗");
		System.out.println("    학생&수업 관리 프로그램 ");
		System.out.println("　　　1. 학생 리스트 출력            ");
		System.out.println("　　　　2. 학생 등록     ");
		System.out.println("　　　　3. 학생 검색            ");
		System.out.println("　　　　4. 수강 신청          ");
		System.out.println("　　　　5. 수강 철회            ");
		System.out.println("　　　6. 프로그램 종료        ");
		System.out.println(" ╚═════           ═════╝");
		System.out.println("      번호를 선택하세요.     ");
		
		menu=scan.nextInt();
		switch(menu) {
		case 1:
			System.out.println("학생 리스트를 출력합니다. >");
			m.printStudent();
			break;
		case 2:
			System.out.println("학생 정보를 등록합니다. >");
			m.insertStudent(scan);
			break;
		case 3:
			System.out.println("학생 정보를 검색합니다. >");
			m.serchStudent(scan);
			break;
		case 4:
			System.out.println("수강 신청 >");
			m.registerSubject(scan);
			break;
		case 5:
			System.out.println("수강 철회 >");
			m.deleteSubject(scan);
			break;
		}
		}while(menu!=6);
			System.out.println("프로그램을 종료합니다.");
		
		scan.close();
	}

}
