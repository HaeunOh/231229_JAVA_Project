package day02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*카페에 제출
		 * 정수 2개와 연산자 1개를 입력받아 두 정수의 연산을 출력
		 * ex) 2 3 + = 2+3=>5
		 * ex) 5 1 - = 5-1=>4
		 * 연산자는 + - / * % 가능 
		 * 다른 종류의 연산자가 들어오면 잘못된 연산자로 출력
		 * 
		 * scanner 있어야 함
		 * 연산자에 따라서 연산의 종류를 결정해야 함*/
		
		//연산자 = char(기본자료형) ==를 이용해 비교 가능 / String(객체) ==로 비교 불가능
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자(정수)를 입력해주세요.");
		int num1 = scan.nextInt();
		System.out.println("다음 숫자(정수)를 입력해주세요.");
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력해주세요.");
		char op = scan.next().charAt(0); //한글자 받기
		
		int a= num1-num2;
		int b= num1*num2;
		/*double c= num1/(double)num2;
		int d=num1%num2;*/ //이게 선언된 상태로 식에 c,d가 들어가면 여기서 미리 계산이되니까 에러남
		
		/*if ((op=='%'||op=='/') && num2==0) {
			System.out.println("잘못 입력된 값입니다.");
		}*/
		
		// /,%일 경우 num2가 0이되면 안내문구 띄우기
		
		switch (op) {
		case '+':
			System.out.println(""+num1+op+num2+"="+(num1+num2));
			break;
			
		case '-':System.out.println(""+num1+op+num2+"="+a);
			break;
			
		case '*':System.out.println(""+num1+op+num2+"="+b);
			break;
			
		case '/':
			if (num2==0) {
				System.out.println("잘못 입력된 값입니다.");
			}else System.out.println(""+num1+op+num2+"="+(num1/(double)num2));
			break;
			
		case '%':
			if (num2==0) {
				System.out.println("잘못 입력된 값입니다.");
			} else System.out.println(""+num1+op+num2+"="+(num1%num2));
			break;
			
		default:
			System.out.println("잘못 입력된 값입니다.");
		}
		
		
		scan.close();
		
	}

}
