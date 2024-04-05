package day11;

public class 과제 {

	public static void main(String[] args) {
		/* 메서드를 이용하여 작업.
		 * 두 정수의 값이 주어졌을 때, 주 정수 사이의 모든 정수의 합을 리턴하는 메서드
		 * ex) a=3, b=5 => 3+4+5=12 리턴
		 * ex) a=5, b=1 => 1+2+3+4+5=15 리턴
		 * ex) a=3, b=3 => 3 리턴
		 * */
		
		과제 hw = new 과제();
		System.out.println(hw.BetweenSum(3, 3));
		System.out.println(hw.BetweenSum(1, 10));
		System.out.println(hw.BetweenSum(10, 1));
		
	}
	
	//들어가는 값: 매개변수 , 나오는 값: 리턴타입
	//
	public int BetweenSum (int a, int b) {
		int sum=0;
		if(a<=b) {
			for (int i=a; i<=b; i++) {
				sum+= i;
			}
		}else {
			for (int i=b; i<=a; i++) {
			sum+= i;
			}	
		} return sum;

	}
	
	//메서드 더 간단하게 줄이는 법
	public int sum2 (int a, int b) {
		int sum=0;
		int max=Math.max(a, b);
		int min=Math.min(a, b);
		
		for(int i=min; i<=max; i++) {
			sum+=i;
		}
		return sum;
	}
	
		
	
	
	
	
	
	
	
}
