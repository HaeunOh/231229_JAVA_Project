package day18;

import java.io.IOException;
import java.util.Scanner;

import studentManager2.Manager;

public class WordMain {

	public static void main(String[] args) throws IOException {
		/* 단어장 프로그램 작성
		 * 1. 단어 등록 | 2. 단어 검색 | 3. 단어 수정 | 4. 단어 출력 | 5. 종료
		 *
		 *WordManager 클래스를 이용하여 메서드 구현
		 *map을 이용하여 단어 등록
		 *기본 단어 등록 (5가지 등록)
		 *main에서는 메뉴가 반복 실행되도록 설정.
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		//매니저를 호출하기 위한 객체
		WordManager m = new WordManager();
		m.basicWord(); //기본 세팅 단어 호출
		
		int menu = 0;
		do {
			//메뉴넣기
			System.out.println("【                 𝙈𝙚𝙣𝙪                  】");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("  1. 단어 등록 | 2. 단어 검색 | 3. 단어 수정 ");
			System.out.println("  4. 단어 출력 | 5. 단어 삭제 | 6. 파일 출력 ");
			System.out.println( "             7. 종     료  ");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println();
			System.out.println("메뉴 선택 》》》");
			
			menu = scan.nextInt();
			
			//메뉴에 따른 분기 구현
			switch(menu) {
			case 1: m.insertWord(scan); break;
			case 2: m.serchWord(scan); break;
			case 3: m.correctionWord(scan); break;
			case 4: m.printWord();  break;
			case 5: m.deleteWord(scan); break;
			case 6: m.printFile(); break;
			case 7: break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			
			}
			
			
		}while(menu!=7);
		System.out.println("단어장이 종료되었습니다.");
		
		
		scan.close();
	}

}
