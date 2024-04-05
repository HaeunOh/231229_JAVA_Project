package day03;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For01 복습
		
		/* 1부터 10까지 콘솔에 출력*/
		 for (int i=1; i<=10; i++){
			 System.out.print(i+"  ");
		 }
		System.out.println();
		
		//1부터 10까지 짝수만 출력
		for (int i=1; i<=10;i++) {
			if(i%2==0) {
				System.out.print(i+"  ");
			}
		}
		System.out.println();
		
		//1부터 10까지의 합계
		
		int sum=0; //지역변수는 반드시 초기화 해야함. 초기화 기본값 숫자:0 문자:null
		for (int i=1; i<=10; i++) {
			sum=sum+i;
			} System.out.println(sum);
			
			System.out.println();
			
			//1부터 10까지의 짝수합과 홀수합 구하기
		
			int sum_even=0;
			int sum_odd=0;
			for(int i=1; i<=10; i++)
				if(i%2==0) {
					sum_even+=i;
				} else {
					sum_odd+=i;
				}
			System.out.println("짝수 합은: "+sum_even);
			System.out.println("홀수 합은: "+sum_odd);
		
	}
		
	}
	

