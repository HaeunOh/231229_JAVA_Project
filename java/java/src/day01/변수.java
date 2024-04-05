package day01;

public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*변수선언
		 * 자료형(타입) 변수명;
		 * 
		 * 변수선언+초기화;
		 * 자료형(타입) 변수명=값;
		 * 
		 * */
		
		int num=123; //선언+초기화
		System.out.println(num);
		
		
		
		int num1=12, num2=34, num3=56; //같은 자료형의 한줄 선언 가능.
		System.out.println(num1);
		
		num1=78; //=(대입연산자) 오른쪽의 값을 왼쪽의 변수에 저장 (덮어쓰기)
		System.out.println(num1);
		
		// 8개의 기본 자료형은 지역변수 범위 (scope) {}
		{
			int num4=12;
			System.out.println(num4);
		}
		
		System.out.println(num3);
		
		//한글자만 저장 가능한 char = 코드표에 나오는 코드값을 저장함
		//"문자열" < 따옴표 안에는 문자만, 숫자는 그냥 씀,char는 '작은따옴표안에' 'a'
		//String("문자열")/ char('한글자만 가능') 
		
		char ch='a';
		System.out.println(ch);
		
		double dou=3.1;
		System.out.println(dou);
		
		byte b=1;
		System.out.println(b);
		
		boolean boo=false;//트루나 펄스로만 저장가능
		System.out.println(boo);
		
		//float/long 자료형은 접미사를 붙여야 사용가능.
		//float(f F) , long(l L) 
		
		float f=1.2f;
		long l=11L;
		System.out.println(f);
		System.out.println(l);
		
		num1=010; //8진수로 인식 (0~7까지만 인식해주는 진법의 형태, 8은 10을 의미)
		//10진수는 0~9까지 인식하고 10을 10으로 인식하는 것
		//16진수 0~15 인식, 10은 16으로 인식. 0~9는ABCDEF 
	
		System.out.println(num1);
		
		num2=0x10; //16진수로 인식
		System.out.println(num2);
		
	// + - * / = 더하기 빼기 곱하기 나누기 %=나머지를 나타내는 연산자
		num1=10;
		num2=20;
		System.out.println(num1%num2);
		
	//괄호안에 연산자를 넣으면 연산이 가능함
		//국어점수 (kor), 영어점수 (eng), 수학점수 (math) 세 개의 점수를 변수로 선언하고,
		//값을 입력하여 세 점수의 합을 콘솔에 출력해주세요.
		
	 num1=70;
	 num2=80;
	 num3=90;
	 
	 System.out.println(num1+num2+num3);
	 System.out.println(240/3);
	 
	//선생님 답안
	 int kor=50;
	 int eng=70;
	 int math=40;
	 System.out.println(kor+eng+math);
	 int sum=kor+eng+math;
	 System.out.println("합계:"+sum);
	 //+:숫자+숫자(더하기연산자)
	 //+:숫자+문자(연결연산자)
	 System.out.println("평균:"+sum/3);
//나누기인 sum/3이 먼저처리되어서 평균:53이라는 답이 출력됨
	 
	 int a=10;
	 a += 10; //a=a+10;
	 System.out.println(a);
	 
	 System.out.println(a++);
	 System.out.println(a);
	 a++;
	 System.out.println(a);
	 
	 
	 
	}
	
}