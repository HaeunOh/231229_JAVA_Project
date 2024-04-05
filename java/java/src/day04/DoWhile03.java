package day04;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/* 숫자 2개를 입력받고,
		 * menu
		 * 1. + | 2. - | 3. * | 4. / | 5. %
		 * menu에 따라서 두수의 연산결과를 출력
		 * 
		 * ex)5와 3을 입력받았다고 했을 때
		 * 1=>5+3=8
		 * 2=>5-3=2
		 * ...
		 * 6=>종료
		 * 다른 번호는 다른 메뉴로 출력
		 * */

		Scanner scan = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력해주세요.");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int menu=0;
		
		do {
			System.out.println("-----menu-----");
			System.out.println("1. +  | 2. -  | 3. *  | 4. /  | 5. %  | 6.종료하기");
			System.out.println("연산자를 선택해주세요.");
			
			menu=scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println(num1+num2);
				break;
				
			case 2:
				System.out.println(num1-num2);
				break;
				
			case 3:
				System.out.println(num1*num2);
				break;
				
			case 4:
				if (num2==0) {
					System.out.println("잘못된 입력값입니다.");
					System.out.println("두 번째 정수를 다시 입력해주세요.");
					num2=scan.nextInt();
					System.out.println(num1/num2);
					
				}else {
						System.out.println(num1/num2);
				}
				break;
				
			case 5:
				if (num2==0) {
					System.out.println("잘못된 입력값입니다.");
					System.out.println("두 번째 정수를 다시 입력해주세요.");
					num2=scan.nextInt();
					System.out.println(num1%num2);
				} else {
					System.out.println(num1%num2);
				}
				break;
				
			default:
				System.out.println("잘못 선택하셨습니다.");
				break;
				
		} 
			}while(menu!=6);
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		scan.close();
		
		
	
	
	}
	
}


