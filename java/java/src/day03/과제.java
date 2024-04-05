package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 
		 * 1~50 사이의 랜덤한 수 하나를 생성하여 맞추는 게임
		 * ex) 컴퓨터가 랜덤수 하나 생성 =23
		 * "정수를 입력하세요"
		 * 사용자 입력:10
		 * 컴퓨터:up!!
		 * 사용자 입력:20
		 * 컴퓨터:up!!
		 * 사용자 입력:30
		 * 컴퓨터:down!!
		 * 사용자 입력:23
		 * 컴퓨터:정답입니다!!
		 * */

		Scanner scan = new Scanner(System.in);
		System.out.println("컴퓨터가 임의로 뽑은 1부터 50까지 숫자 중 하나를 입력해 맞춰주세요.");
	
		int num=scan.nextInt();
		int ran= (int)(Math.random()*50)+1; //1부터 50까지의 랜덤수 생성
		int i =0;
		int b =1;
		while(num!=ran){
			i++; //while문 안에 scan.nextInt 를 넣으면 자동으로 입력란 반복됨
			
			if(b>=5) {
				System.out.println("입력횟수 초과로 게임종료되었습니다.");
				break;
			}
			
			
			if(num<ran) {
				System.out.println("up!");
				System.out.println("틀렸습니다. 다시 입력하세요.");
				num=scan.nextInt();
				b++;
				
			}if(num>ran) {
				System.out.println("down!");
				System.out.println("틀렸습니다. 다시 입력하세요.");
				num=scan.nextInt();
				b++;
				
			
			}if(num==ran){
				System.out.println("정답입니다!");
				System.out.println(b+"번 만에 맞추셨습니다.");
				break;
			
			}
		}
		
		scan.close();
		} 
	}

	

