package day03;

public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 배수: 값을 일정하게 곱해서 나오는 값.
		 * 10과 15의 공배수: 공통된 배수
		 * 10: 10 20 30 40 50 60 ...
		 * 15: 15 30 45 60 75 90 ...
		 * 공배수: 30 60 90...
		 * 최소공배수: 30
		 * */
		
		// 1부터 100까지 공배수 출력
		// if (i%10==) && (i%15==0)
		
		int num1=10;
		int num2=15;
		for(int i=num1;; i=i+num1) { //최대값을 지정하지 말고 출력한 다음에 바로 브레이크 걸면 최소공배수 구하기 가능
			if (i%num1==0 && i%num2==0) {
				System.out.print(i+" ");
				break;
			}
		}
		
		
	}

}
