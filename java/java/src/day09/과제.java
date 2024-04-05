package day09;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
		
		
		int comRandom[]=new int[3];
		int userNum[]=new int[3];
		randomArray(comRandom);
		Scanner scan = new Scanner (System.in);
		System.out.println("야구 게임 시작>>");
		System.out.println("컴퓨터 결정 완료, 1부터 9까지의 숫자 중 중복 없이 3개의 수를 입력하세요.");
	
		for(int i=0; i<userNum.length; i++) {
			userNum[i]= scan.nextInt();
		}
		int ball=0;
		int strike=0;
		
		for(int i=0; i<comRandom.length; i++) {
			for(int j=0; j<userNum.length; j++) {
				if(comRandom[i]==userNum[j] && i==j) {
					strike++; 
				}else if(comRandom[i]==userNum[j] && i!=j) {
					ball++;
				}
			}
		}
	
		
		System.out.println(strike+"strike");
		System.out.println(ball+"ball");
		
		scan.close();
		
		
		
		
		
	}	
	public static boolean isContain (int arr[],int random) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==random) {
				return true;
			
			}
		}
		
		return false;
	}
	
	public static void randomArray (int arr[]) {
		//배열을 받아서 배열에 랜덤 값을 중복없이 채우기
		//random==arr[i] false면 추가 -> 중복 없게하기
		int cnt=0; //while문에서 i역할을 할 변수
		while(cnt<arr.length) {
			int random=(int)(Math.random()*9)+1;
			if(!isContain(arr, random)) {
				arr[cnt]=random;
				cnt++;
			}
		}
	}
}
 