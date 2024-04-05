package day02;


public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 조건문 : if문, switch문 -> 조건이 참일 경우 실행문을 실행함
		 * if(조건식) {실행문;} = if문의 기본형태
		 * 실행문이 한줄일 경우 중괄호 생략가능, 실행문이 두줄이상일 경우 반드시 중괄호가 필요. 없으면 error
		 * 조건식은 반드시 true or false 형태로 나올 수 있게 작성*/
		
		int num =0;
		//num가 0보다 크면 양수입니다.=> 라고 출력할 것임.
		
		if(num>0) {
	System.out.println("양수입니다.");
		}
		//num가 0보다 크면 양수입니다. 아니면 음수입니다.
		
		if(num>0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		
		//num가 0보다 크면 양수/아니면 음수/0이면 0입니다. 출력
		
		if(num>0) {
			System.out.println("양수입니다.");
		}
		else if (num==0) {
			System.out.println("0입니다.");
		}
		else {
			System.out.println("음수입니다.");
		}
		System.out.println("--------------------------------------");
	
		//num가 0보다 크면 양수 (10보다 크면 10보다 큽니다.) / 아니면 음수 / 0이면 0입니다.
		
		num=11;
		
		if(num>0) {
			System.out.println("양수입니다.");
			if(num>10) {
				System.out.println("10보다 큽니다.");}
		}
		else if (num==0) {
			System.out.println("0입니다.");
		}
				else {
			System.out.println("음수입니다.");
		}
		
		//num2 변수를 선언한 후 num2가 짝수인지 홀수인지 출력
		
		int num2 =2034095465;
		
		if (num2%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		
		
	
		
		
		
			}

}

