package day09;

import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		/* 컴퓨터가 가위바위보를 랜덤으로 선택 (0=가위, 1=바위, 2=보)
		 * 내가 가위바위보 중 하나를 선택해서 입력
		 * 승/패/무 결과 출력
		 * ex)
		 * com=0(가위)
		 * user=가위
		 * => 무승부입니다.*/
		
		Scanner scan=new Scanner(System.in);
		
		int random=(int)(Math.random()*3)+1;
			
			while(random>0) {
			System.out.println("숫자를 눌러 가위바위보 게임을 시작하세요.");
			System.out.println("| 1.가위 | 2.바위 | 3.보 |");
			int num=scan.nextInt();
			if(random==num) {
				System.out.printf("비겼습니다.%n");
				
				
			}if(random==1 && num==2) {
				System.out.printf("당신: 바위 컴퓨터: 가위"+"%n이겼습니다!%n");
				
				
			}if(random==1 && num==3) {
				System.out.printf("당신: 보 컴퓨터: 가위"+"%n졌습니다...%n");
				
				
			}if(random==2 && num==3) {
				System.out.printf("당신: 보 컴퓨터: 바위"+"%n이겼습니다!%n");
				
				
			}if(random==2 && num==1) {
				System.out.printf("당신: 가위 컴퓨터: 바위"+"%n졌습니다...%n");
			
				
			}if(random==3 && num==1) {
				System.out.printf("당신: 가위 컴퓨터: 보"+"%n이겼습니다!%n");
				
				
			}if(random==3 && num==2) {
				System.out.printf("당신: 바위 컴퓨터: 보"+"%n졌습니다...%n");
			
			
		
		}
			}
				
		scan.close();

	}
	
	

}
