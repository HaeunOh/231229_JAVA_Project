package day03;

public class While02 {

	public static void main(String[] args) {
		/* 1~50까지의 짝수
		 * 2 4 6 8 10
		 * 12 14 16 18 20
		 * 22 24 26 28 30
		 * 32 34 36 38 40
		 * 42 44 46 48 50
		 * 이렇게 출력받고 싶을 때*/

		int i=0;
		while(i<50) {
			i++;
			if(i%2==0) {
				System.out.printf("%3d",i);
			}if(i%10==0) {
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("출력구문");
		/* System.out.println: 줄바꿈이 있는 출력, 값이 없어도 error 안 나고 줄만 바뀜
		 * System.out.print: 줄바꿈이 없는 출력, 출력값이 없으면 error가 남
		 * System.out.printf: 지시자를 이용한 출력
		 * 
		 * 지시자
		 * ★ %d (정수형) , %f(실수형), %c(문자), %s(문자열), %n(줄바꿈) ★
		 * -소수점 설정 가능.
		 * -공백 추가 가능.
		 * */
		
		System.out.printf("%.2f%n",1.3333333333); // 출력결과: 1.33 반올림 가능한 경우 반올림됨.
	
		
		int num1 = 5;
		int num2 = 3;
		//5+3=8
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.printf("%d+%d=%d",num1,num2,(num1+num2));
		
		double num3 = 1.2;
		double num4 = 5;
		//1.2/5=값
		
		System.out.printf(" %n %.1f / %.1f = %.1f ",num3,num4,(num3/num4));
		
		
	}

}
