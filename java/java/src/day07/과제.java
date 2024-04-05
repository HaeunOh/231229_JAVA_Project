package day07;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 계산기 만들기
		 * --menu--
		 * 1.덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 나눗셈 | 5.나머지 | 6. 종료
		 * >>메뉴선택 1
		 * >>숫자1 5
		 * >>숫자2 10
		 * 결과:5+10=15
		 * */
		Scanner scan = new Scanner (System.in);
		int menu=0;
		do {
			System.out.println("----------------------------계산기----------------------------");
			System.out.println("1.+ (더하기) | 2.- (빼기) | 3.* (곱하기) | 4. / (나누기:몫) | 5. % (나누기:나머지) | 6. 계산기 종료");
			System.out.println(">> 연산자를 선택하세요. >");
			menu = scan.nextInt();
			
			
			switch(menu) {
			case 1:
				
				System.out.println("숫자를 입력하세요.");
				int num1=scan.nextInt();
				int num2=scan.nextInt();
				System.out.println("답:"+sum(num1, num2));
				break;
			case 2:
				System.out.println("숫자를 입력하세요.");
				int num3=scan.nextInt();
				int num4=scan.nextInt();
				System.out.println("답:"+sub(num3, num4));
				break;
			case 3:
				System.out.println("숫자를 입력하세요.");
				int num5=scan.nextInt();
				int num6=scan.nextInt();
				System.out.println("답:"+mul(num5, num6));
				break;
			case 4:
				System.out.println("숫자를 입력하세요.");
				int num7=scan.nextInt();
				int num8=scan.nextInt();
				System.out.println("답:"+div(num7, num8));
				break;
			case 5:
				System.out.println("숫자를 입력하세요.");
				int num9=scan.nextInt();
				int num10=scan.nextInt();
				System.out.println("답:"+mod(num9, num10));
				break;
			case 6:
				System.out.println("종료 버튼을 누르셨습니다.");
				break;
				default:
					System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu!=6);
		System.out.println("계산기 프로그램을 종료합니다.");
		
		
		
		scan.close();
		
		
	}
	
		public static int sum (int num1, int num2) {
			return num1+num2;
		}
		
		
		public static int sub (int num1, int num2) {
			
			if(num2>num1) {
				return num2-num1;
			} return num1-num2;
		}
	
			public static int mul (int num1, int num2) {
				return num1*num2;
			}
		
			public static double div (int num1, int num2) {
				if(num2>num1) {
					return num2/(double)num1;
				} return num1/(double)num2;
			}
		
			public static int mod (int num1, int num2) {
				if(num2>num1) {
					return num2%num1;
				} return num1%num2;
			}

}
