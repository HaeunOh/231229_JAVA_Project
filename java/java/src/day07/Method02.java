package day07;

public class Method02 {

	public static void main(String[] args) {
		/* + - * /% 연산 해주는 메서드 생성 
		 * main에서 호출하여 확인*/
		
		int num=sum(4, 2);
		System.out.println(num);
		
		int num1=sub(4, 2);
		System.out.println(num1);
		
		int num2=mul(4, 2);
		System.out.println(num2);
		
		double num3=div(4, 2);
		System.out.println(num3);
		
		int num4=mod(2, 4);
		System.out.println(num4);

	}
	
	// 메서드 선언 위치
	// 두 정수의 합을 알려주는 메서드 sum
	public static int sum (int num1, int num2) {
		return num1+num2;
	}
	// 두 정수의 차를 알려주는 메서드 sub
	
	public static int sub (int num1, int num2) {
		//num1/num2중 큰 수에서 작은 수를 뺐으면 좋겠다.
		if(num2>num1) {
			return num2-num1;
		} return num1-num2;
	}
	// 두 정수의 곱을 알려주는 메서드 mul
		public static int mul (int num1, int num2) {
			return num1*num2;
		}
	// 두 정수의 몫을 알려주는 메서드 div
		public static double div (int num1, int num2) {
			if(num2>num1) {
				return num2/(double)num1;
			} return num1/(double)num2;
		}
	// 두 정수의 나머지를 알려주는 메서드 mod
		public static int mod (int num1, int num2) {
			if(num2>num1) {
				return num2%num1;
			} return num1%num2;
		}

}
