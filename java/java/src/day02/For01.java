package day02;

public class For01 {

	public static void main(String[] args) {
		/*반복문: 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 *  for, while, do~while
		 *  -for, while 동작방식이 같음. //선불
		 *  => 조건에 맞지 않으면 한번도 실행되지 않을 수 있음.
		 *  -do~while=> 조건에 맞지 않아도 무조건 1번은 실행됨. //후불
		 *  
		 *  for(초기화1; 조건식258; 증감식47;){
		 *  실행문369;}
		 *  
		 *  -초기화: 조건식이나, 실행문에서 사용될 변수를 초기화 : 생략 가능, 여러 변수 초기화 가능. 처음 1번만 실행됨.
		 *  -조건식: 반복문의 반복을 결정하는 식 (true/false 형태로 나타내줘야 하며, true 일 때만 반복함.) ★ :생략가능
		 *  -증감식: 조건식에서 사용할 변수를 증가 or 감소시켜 반복 횟수를 조절할 수 있음. :생략가능
		 * */

		//1부터 10까지 출력하는 예제
		//for문에서는 일반적으로 i변수를 쓰는 것이 국룰임 (index)
		
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
			}
		System.out.println();
		//현상태에 i의 값은 11
		//System.out.println(i);
		
		//10부터 1까지 출력하는 예제
		
		
		for(int i=10; i>=1; i--) {
			System.out.print(i+" "); //ln을 지우면 줄바꿈 없이 나옴, i+" " 하면 줄바꿈 없이, 띄어쓰기한 결과값 나옴
			}
	
		System.out.println();
		
		//2부터 10까지 짝수만 출력하는 예제
		for(int i=2; i<=10; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		//1부터 10까지의 합계를 출력
		
		int sum=0; //for문 안에 sum=0 선언하면 계속 누적 계산되니까 for문 밖에 선언하기
		for(int i=1; i<=10; i++) 
			sum=sum+i;
		System.out.println(sum);
		
		
		           

			
		
			
	
			
		
		}
}

