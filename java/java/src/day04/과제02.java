package day04;

import java.util.Scanner;

public class 과제02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int random = 0; //주사위 값 (랜덤수)
		int sum = 0;  // 거리 누적 값
		int count = 0; // 주사위 던진 횟수 누적
		int last = 30; // 최종 목표 이동 수
	
		//전체 로직에 필요할 것 같은 변수 미리 정리해서 선언하고 시작하기
		System.out.println("Enter키로 주사위 게임 시작하기!");
		
		while (sum<last) { // 거리 누적 값이 최종 목적지보다 작을 때 true이므로 계속 while문이 돌아감
			scan.nextLine(); // enter를 이용하여 주사위를 던질 수 있는 값을 받는 역할
			random=(int)(Math.random()*6)+1; // 1~6 랜덤수 저장
			//발생값과 거리를 합산
			sum+=random;
			count++;
			System.out.println("주사위:"+random);
			System.out.println(random+"칸 전진=>"+(last-sum)+"칸 남았습니다.");
		
		}
		System.out.println("도착! 총 이동 횟수 >"+count+"회");
		scan.close();

	}

}
