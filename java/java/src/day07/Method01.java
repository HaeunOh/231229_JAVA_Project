package day07;

public class Method01 {
	
	//메서드 선언 가능 위치 (클래스 안에 있긴 하지만 다른 메서드 ↓ 랑 겹치면 안됨)

	public static void main(String[] args) {
		/* Method(메서드) : 기능(함수), function 을 구현하는 것
		 * 메서드 선언 및 구현
		 * 접근제한자(제어자) 리턴타입 메서드명(매개변수){
		 *		 구현;
		 *	}
		 *
		 * -접근제한자(제어자) : 접근할수 있는 주체의 제한범위
		 * -리턴타입 : 반환값의 타입 (메서드 실행 후 결과로 알려주는 값의 자료형)
		 * -메서드명 : 메서드의 이름(소문자로 시작하는 것이 원칙)
		 * -매개변수 : 기능을 수행하기 위해 필요로 하는 값 (외부에서 들어와야 하는 값) => 없다면 () 비우면 됨
		 * -void : 리턴할 것이 없다는 것을 의미
		 *
		 * -메서드의 위치
		 * => 클래스 안, 다른 메서드 밖 (이중 메서드 불가능)
		 * => 메서드의 선언 순서는 아무 상관 없음.
		 * => 메서드는 순서대로 실행되지 않음.
		 *   	 ↘ 호출이 되어야 실행됨. ex)scan.next(); //메서드 호출
		 * */
		
		int hap = sum(10,20);
		System.out.println(hap);
		sum1(1, 2);
		int cha = sub(1,19);
		System.out.println(cha);
	}
	
	//메서드 선언 가능 위치
	// 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	// 리턴타입 : 합 = int
	// 메서드 명 : sum
	// 매개변수 :두 정수 = int num1, int num2
	
	public static int sum (int num1, int num2) {
		return num1+num2;
	}
	
	// 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	// 리턴 타입: void=>없음. 바로 출력
	// 매개변수: 두 정수 (int num1, int num2)
	public static void sum1 (int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	// 두 정수가 주어지면 두 정수의 차를 알려주는 (리턴하는) 메서드
	public static int sub (int num1, int num2) {
		//num1/num2중 큰 수에서 작은 수를 뺐으면 좋겠다.
		if(num2>num1) {
			return num2-num1;	
		}else {
			return num1-num2;
			}
		
	}
}




