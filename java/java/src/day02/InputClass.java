package day02;

import java.util.Scanner;

public class InputClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 콘솔 입력: 콘솔에서 값을 입력받는 것을 의미
		 * Scanner 클래스=> 콘솔에서 값을 입력받을 수 있게 해주는 클래스
		 * */
		
		Scanner scan = new Scanner(System.in);
		/*System.out.println("숫자(정수)를 입력해주세요."); //스캐너를 선언
		
		int num = scan.nextInt(); //숫자를 입력받는 코드
		System.out.println("내가 입력한 수:"+num);
		
		if(num%2==0) {
			System.out.println("입력한 수는 짝수입니다.");
		}else {
			System.out.println("입력한 수는 홀수입니다.");
		}
		
		System.out.println("----------------------------------------");
		
		System.out.println("실수입력>");
		double num2 = scan.nextDouble();
		System.out.println("내가 입력한 실수"+num2);
		
		System.out.println("----------------------------------------");
		
		System.out.println("한글자 입력>");
		//문자열 입력: next() / 한글자 입력: charAt(index) -> 문자열중 해당하는 index 번지의 한글자를 추출해주세요 라는 의미
		//index의 번지는 0부터 시작. ex) 가나다에서 0번지는 가, 1번지는 나, 2번지는 다
		
		char ch= scan.next().charAt(0);
		System.out.println("내가 입력한 글자:"+ch); */
		
		/*System.out.println("----------------------------------------");*/
		System.out.println("한 단어 입력>");
		String s= scan.next();
		System.out.println("내가 입력한 단어:"+s);
		
		scan.nextLine(); //위에서 입력한 Enter 처리용
		
		System.out.println("----------------------------------------");
		System.out.println("여러 단어 입력>");
		String str=scan.nextLine();
		System.out.println("내가 입력한 단어:"+str);
		
		//여러 단어 출력: nextLine() : 공백 포함
		scan.close(); //스캐너클로즈 선언을 해야만 클래스가 import 클래스로 바뀜
	}

}
