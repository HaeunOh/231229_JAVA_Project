package day08;

public class Method04 {

	public static void main(String[] args) {
		/*최대공약수, 최소공배수 리턴
		 * 리턴을 받을 값을 메인에서 출력
		 * */
		int result=gcd(12,6);
		System.out.println("최대공약수:"+result);
		
		int i=lcm(10,20);
		System.out.println("최소공배수:"+i);
		
		int num=lcm2(10, 15);
		System.out.println("최소공배수2:"+num);

	}
	/*두 정수를 매개변수로 받아 최대공약수를 리턴하는 메서드
	 * 매개변수: 두 정수
	 * 리턴타입: int */
	public static int gcd (int num1, int num2) {
		int result=0;
		for(int i=1; i<=num1; i++) {
			if (num1%1==0 && num2%i==0) {
				result=i;
			}
		} return result;
	
	}
	/*두 정수를 매개변수로 받아 최소공배수를 리턴하는 메서드
	 * 매개변수: 두 정수
	 * 리턴타입: int */
	public static int lcm (int num1, int num2) {
		for(int i=num1; ; i=i+num1) {
			if(i%num1==0 && i%num2==0) {
				return i; //메서드에서 리턴을 만나면 값 반환 후 종료되므로 break 필요X
			}
		}
		
	}
	
	//최소공배수 규칙: 두 수를 곱한 후 최대공약수로 나누면 최소공배수.
	//10*15=150 , 150/5(최대공약수)=30
	//메서드 안에서 메서드를 호출하여 그 리턴값을 사용하기
	
	public static int lcm2 (int num1,int num2) {
		return num1*num2/gcd(num1,num2);
	}
	

}
