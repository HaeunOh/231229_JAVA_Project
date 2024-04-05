package day10;

import java.util.Scanner;

import day08.Method07;

public class BaseBallGame {

	public static void main(String[] args) {
		/* 야구 게임을 메서드화
		 * 사용자 번호는 직접 입력
		 * 번호는 랜덤 생성 (1~9, 중복x)
		 * 숫자끼리 중복 안되게 하는 isContain => Method07에서 호출하여 사용*/
		
		Scanner scan=new Scanner(System.in);
		int comNum[]=new int[3];
		int myNum[]=new int[3];
		int s=0, b=0;
		createArray(comNum);
		// Method07.printArray(comNum);
		
		//사용자 번호 입력
		while(s!=3) {
			System.out.println("myNum 3개 입력>");
			int cnt=0;
			while(cnt<3) {
				myNum[cnt]=scan.nextInt();
				cnt++;
			}
			
			//결과 출력
			s=strike(comNum, myNum);
			b=ball(comNum, myNum);
			
			if(s!=0) {
				System.out.println(s+"S");
			}
			if(b!=0) {
				System.out.println(b+"B");
			}
			if(s==0 && b==0) {
				System.out.println("아웃!");
			}
		}
		
		System.out.println("정답! 프로그램 종료.");
		
		scan.close();
		
	}
	//랜덤으로 배열을 중복되지 않게 생성
	//메서드07의 컨테인 메서드 가져와서 사용
	public static void createArray(int arr[]) {
		int cnt=0;
		while(cnt<arr.length) {
			int r=(int)(Math.random()*9)+1;
			if(!Method07.contains(arr, r)) {
				arr[cnt]=r;
				cnt++;
			}
		}
	}
	
	//랜덤범위에 상관없이 랜덤수를 채우는 메서드
	//범위를 매개변수로 받아오면됨
	//(int)(Math.random()*개수)+시작값
	//start,count 매개변수로 받아 범위를 생성
	
	public static void createArrayRandom(int arr[],int start,int count) {
		int cnt=0;
		while(cnt<arr.length) {
			int r=(int)(Math.random()*count)+start;
			if(!Method07.contains(arr, r)) {
				arr[cnt]=r;
				cnt++;
			}
		}
	}
	
	//스트라이크 개수를 카운트하는 메서드
	//comNum과 myNum을 주고 번호와 위치가 일치하면 count하는 메서드
	//리턴타입: int count를 리턴
	
	public static int strike(int com[],int my[]) {
		int cnt=0;
		for(int i=0; i<com.length; i++) {
			if(com[i]==my[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	//스트라이크 개수를 카운트하는 메서드
		//comNum과 myNum을 주고 번호만 일치하면 count하는 메서드
		//리턴타입: int count를 리턴
	
	public static int ball (int com[],int my[]) {
		int cnt=0;
		for(int i=0; i<com.length; i++) {
			if(Method07.contains(my, com[i])) {
				cnt++; //ball+strike 같이 체크
			}
		}
		return cnt-strike(com, my);
	}
}