package day06;

public class String01 {

	public static void main(String[] args) {
		/* String 클래스 = 문자열을 다루기 위한 클래스 => 참조변수
		 * String str=new String();
		 * String str="홍길동"; //일반 자료형처럼 이용 가능.
		 * 
		 * */
		
		String str="홍길동!!!!!!";
		System.out.println(str);
		String str1=new String();
		str1="홍길순";
		System.out.println(str1); //값 없이 그냥 찍는다고 해서 int=arr 처럼 주소를 출력하진 않음.
		
		//length : 전체 글자의 길이 (총 글자수)
		System.out.println("---length---");
		System.out.println(str.length()); //str의 총 글자수를 리턴
		
		//charAt(index) : index번지에 있는 문자열을반환
		System.out.println("---charAt(index)---");
		System.out.println(str.charAt(0)); //0번지 글자 '홍' 리턴
		
		//subString : 문자열을 추출
		System.out.println("---subString---");
		System.out.println(str.substring(0,2)); //0번지부터 2번지 전까지 추출 (2번지는 포함하지 않음)
		System.out.println(str.substring(1)); //1번지부터 끝까지
		
		//str.compareTo(str1) : str과 str1을 비교하여 사전순으로 앞에 있으면 -1, 같으면 0, 뒤에 있으면 1을 리턴
		System.out.println("---str.compareTo---");
		System.out.println("banana".compareTo("apple"));
		System.out.println("a".compareTo("g"));
		System.out.println("a".compareTo("a"));
		
		//concat : 이어붙이기 ('+' 연산자와 같은 의미)
		System.out.println("---concat---");
		System.out.println("Hello".concat("Java"));
		System.out.println("Hello"+"Java");
		
		//equals : 두 문자열이 같은지 비교 (대소문자 구분O) 같으면 true, 다르면 false 리턴
		//문자는 == 로 비교가 안됨
		//참조변수는 ==로 비교하게 되면 주소가 같은지 확인 
		System.out.println("---equals---");
		System.out.println("abc".equals("def")); //false
		System.out.println("abc".equals("abc")); //true
		
		//indexOf : 문자의 위치(index)를 찾아주는 기능, 찾는 문자가 없으면 -1을 리턴
		//lastIndexOf : 문자의 위치를 뒤에서부터 찾아주는 기능
		System.out.println("---indexOf---");
		System.out.println(str.indexOf("동")); //홍길동!!!!!! 에서 2번지에 동이 있으므로 '2'리턴
		System.out.println(str.indexOf("!")); //!이 많아도 가장 먼저 나오는 !의 번지인 '3' 리턴
		System.out.println(str.lastIndexOf("!")); //마지막 !의 번지인 '8' 리턴
		System.out.println(str.indexOf("$")); //없는 문자열이라 -1 리턴
		
		//이메일에서 id를 추출
		System.out.println("---email에서 id만 추출---");
		String email="abc123@naver.com";
		System.out.println(email.substring(0,email.indexOf("@")));
		
		//contains : 해당 문자를 포함하는지 체크
		System.out.println("---contains----");
		String file = "이것이 자바다.java";
		System.out.println(file.contains("java")); //("~") 값이 있는지 없는지 체크 후 true / false로 리턴
	
	
	
	
	
	
	
	}

}
