package day01;

public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*연산자 정리
		 * 대입연산자:=, +=, -= ...
		 * =을 기준으로 오른쪽에 있는 값을 왼쪽의 변수에 저장
		 * 왼쪽의 값은 반드시 변수여야 함.
		 * a=b;
		 * 1=a; (x)
		 * a+=1 =< a=a+1 //기존 값과 1을 더해서 a에 저장
		 * */
		int a=10;
		int b=5;
		a=b;
		System.out.println(a);
		a+=10;
		System.out.println(a);
		
		//증감연산자 : ++(1증가) / --(1감소)
		
		a++;
		System.out.println(a);
		System.out.println(a++); //출력 후 1증가
		System.out.println(++a); //1증가 후 출력
		
		//산술연산자: + - * / %(나머지)
		/*나누기 (/)
		 * 정수/정수=정수 (10/3=3) 소수점을 버림
		 * 정수/실수=실수
		 * 실수/정수=실수
		 * 실수/실수=실수
		 * 한쪽이라도 실수가 있으면 실수값이 커버됨.
		 * 
		 * 값/0 => 예외 발생 (Exception)
		 * 자료형이 double /0=> infinity 발생 (무한대)*/
		
		System.out.println("3+2="+(3+2));
		System.out.println("3-2="+(3-2));
		System.out.println("3*2="+(3*2));
		System.out.println("3/2="+(3/2.0));
		System.out.println("3%2="+(3%2));
		
		/*비교연산자: 비교연산의 결과가 반드시 true/false
		 * >= (이상), <=(이하), >(초과), <(미만), ==(같다), !=(같지 않다)
		 * 3>=5 는 false
		 * 
		 * 논리연산자
		 * a&&b: 일때 둘다 true여야 true를 리턴해준다.(and)
		 * a||b: 둘중 하나만 ture여도 true를 리턴 (or)
		 * !a: a 상태 반대 a가 true면 false를 리턴하고 a가 false면 true를 리턴함 (not)
		 */
		System.out.println("3>2?="+(3>2));
		System.out.println("3<2?="+(3<2));
		System.out.println("3==2?="+(3==2));
		System.out.println("3!2?="+(3!=2));
		
	
		System.out.println("&& 연산자:"+(3>2 && 4<3));
		//System.out.println("|| 연산자:"+(3>2 || 4<3));
		
		/*조건선택 연산자:3항 연산자
		 * (조건식)? true : false;
		 * */
		//System.out.println((3<2? "참입니다." : "거짓입니다"));
	 
		//문제: num의 변수를 선언하여 값을 입력하고, num가 짝수인지 홀수인지 판별하세요. *조건선택 연산자를 사용)
		
		int num1 =10;
		System.out.println((num1%2==0)? "짝수입니다" : "홀수입니다");
		
		
			
	}

}
