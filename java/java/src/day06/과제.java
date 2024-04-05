package day06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*숫자를 입력 받아서 받은 숫자를 거꾸로 출력
		 * 각 자리의 합계 출력
		 * ex) 11456 
		 * => 출력: 65411 합계:6+5+4+1+1=결과값
		 * ex) 19874
		 * => 출력: 47891 합계:4+7+8+9+1=결과값
		 * */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num=scan.nextInt();
		//System.out.println(num);
		int sum=0;
		//num/10=몫 출력=>몫을 저장해서 다시 나누는 값으로 사용   
		//num%10= (int)로 저장해서 소수점 빼기나머지 값을 저장 => 마지막자리 (출력)
		
		while (num>0) {
			int b = num%10; //마지막 자리 추출
			System.out.print(b+" ");
			
			sum += b;
			num = num/10; // 정수/정수 => 소수점 버림, 자동으로 int형
		}
		System.out.printf("%n합계:"+sum);
		scan.close();
		
		
		
		
					
		
		
	}

}
