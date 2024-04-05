package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 주사위 게임
		 * 주사위를 던져서 랜덤으로 나오는 숫자만큼 이동해 총 30칸을 이동하면 성공
		 * 주사위는 랜덤으로 생성 (1~6)
		 * ex) 주사위 : 3
		 * 3칸 전진 => 27칸 남았습니다. //남은 칸수 차감
		 * 주사위 : 1
		 * 1칸 전진 => 26칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 전진 => 20칸 남았습니다.
		 * ...
		 * 도착 (총 이동횟수: 10번 => 주사위를 던진 횟수)
		 * 마지막 칸수와 관계없이 30칸을 넘기기만 하면 도착한 것으로 간주
		 * */
		
		Scanner scan = new Scanner (System.in);
		
		int count=0;
		int sum=0;

		int menu=0;
		System.out.println("1.주사위 게임 시작하기  | 2.주사위 게임 종료하기 ");
		menu=scan.nextInt();
		
		do {
			switch(menu) {
			case 1:
				scan.nextLine();
				count++;
				int ran=(int)(Math.random()*6)+1;
				
				System.out.println(ran+"칸 이동하세요.");
				
				sum=sum+ran;
				
				System.out.println((30-sum)+"칸 남았습니다.");
				
				
				System.out.println(count+"번 던졌습니다.");
				
				break;
		
			default:
				
				System.out.println("잘못 선택하셨습니다.");
				
		}
			} while(sum<30);
			System.out.println("주사위 게임을 종료합니다.");
			System.out.println("주사위 게임 결과");
			System.out.println("총 이동 횟수는 "+count+"번 입니다.");
			{
		scan.close();
				
		
		}
	}
	
}