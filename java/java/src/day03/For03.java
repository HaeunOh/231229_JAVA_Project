package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 약수: 나누어서 떨어지는 수의 집합
		 * ex) 6의 약수: 6/1=0, 6/2=0, 6/3=0, 6/4=2, 6/5=1, 6/6=0 //모든 수는 1과 자기 자신을 약수로 갖는다. 
		 * =1,2,3,6 총 4개가 나옴
		 * */
		
		//num를 1부터 num까지 나눈 나머지가 0인 수를 출력하는 것.
		// 6의 약수를 for문으로 출력해보기
		int num = 100;
	for(int i=1; i<=num; i++) {
			if (num%i==0) {
			System.out.print(i+" ");
			}
		}		
		
		System.out.println();
		
		//num1를 입력 받아서 입력받은 수의 약수를 출력하기
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자(정수)를 입력해주세요.");
		int num1= scan.nextInt();
		for(int i=1; i<=num1; i++) {
			if (num1%i==0) {
				System.out.print(i+" ");
			}
		}	


		
		scan.close();
	}

}
