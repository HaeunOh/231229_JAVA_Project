package day09;

import java.util.Scanner;

public class 과제02 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 생성 (각 자리수는 1~9까지의 수) => 배열로 랜덤 저장 (중복 불가능)
		 * 유저는 3자리의 숫자를 맞추는 게임=> 직접 입력 (중복되지 않게...)
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 맞으면 ball
		 * 아무것도 안맞으면 out
		 * 
		 * ex) 컴퓨터 생성 번호: 1 2 3
		 * 사용자 번호: 1 7 8
		 * => 1strike
		 * 
		 * 사용자 번호: 1 3 2
		 * -> 1strike 2ball
		 * 
		 * 사용자 번호: 7 8 9
		 * -> out
		 * 
		 * 사용자 번호: 1 2 7
		 * -> 2strike
		 * 
		 * 사용자 번호: 1 2 3
		 * -> 3strike, 정답
		 * 
		 * 배열&번지수 활용하면 됨*/
		
		Scanner scan=new Scanner(System.in);
		int comNum[]=new int[3]; //컴퓨터가 생성한 번호 배열
		int userNum[]=new int[3]; //내 배열
		
		//메서드는 다른 클래스에서도 불러올 수 있음
		//Method07.lotto(comNum);
		
		
		//컴퓨터 배열을 생성
		//중복되지 않게 랜덤수 추출 저장
		for(int i=0; i<comNum.length; i++) {
			comNum[i]=(int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(comNum[i]==comNum[j]) {
					i--;
					break;
				}
			}
		}
		
		//static으로 생성했기 때문에 클래스명.메서드명으로 호출 가능.
		// Method07.printArray(comNum);
		
		//static이 아닐 경우 하단처럼 객체를 생성하여 객체명으로 메서드 호출.
		// Method07 me = new Method07();
		// me.printArray(comNum);
		//결과 체크
		/*
		 * for(int a: comNum) { 
		 * System.out.print(a+" "); } System.out.println();
		 */
		
		//사용자 숫자 입력
		while(true) {
			int stk=0;
			int ball=0;
			System.out.println("숫자 입력>");
			String mystr=scan.next(); //숫자를 문자로 받음
			String[] myNumstr = mystr.split(""); //한 글자씩 나누어 배열에 저장
			for(int i=0; i<myNumstr.length; i++) {
				//문자를 숫자로 변환하여 myNum에 저장
				userNum[i]=Integer.parseInt(myNumstr[i]);
			}
			
			//숫자 비교
			for(int i=0; i<comNum.length; i++) {
				for(int j=0; j<userNum.length; j++) {
					if(comNum[i]==userNum[j] && i==j) {
						stk++;
					}else if(comNum[i]==userNum[j] && i!=j) {
					ball++; }
				}
			}
			
			//출력
			if(stk==0 && ball==0) {
				System.out.println("out");
			}else {
				System.out.println(">"+stk+"strike,"+ball+"ball");
				
			}
			
			//종료조건
			if(stk==3) {
				//스트라이크가 3이면 종료
				System.out.println("성공! 게임 종료");
				break;
				
				}
	}
		
		scan.close();

	}

}
