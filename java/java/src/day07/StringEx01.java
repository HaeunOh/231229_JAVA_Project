package day07;

public class StringEx01 {

	public static void main(String[] args) {
		/* file에 저장되어 있는 문자를 파일명과 확장자로 분리하여 출력하세요.
		 * 파일명: 이것이 자바다
		 * 확장자: java
		 * */
		String file = "이것이 자바다.java";
		//System.out.println(file.substring(0,7));
		System.out.println("파일명: "+file.substring(0,file.indexOf(".")));
		System.out.println("확장자: "+file.substring(file.indexOf(".")+1));
		//.을 쓸 때는 \\. 으로 입력하거나 배열속의 [.]으로 입력하기
		
		//contains: 문자가 포함되어 있는지 체크 후 boolean으로 리턴
		if(file.contains("java")) {					//조건식 자체가 true인지 보는 것임. 비교구문 안 써도 됨
			System.out.println("java 파일입니다.");
		}
		
	
	}

}
