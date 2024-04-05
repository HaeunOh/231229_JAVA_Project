package day07;


import java.util.Scanner;

public class StringEx02 {

	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을 때,
		 * 검색어를 입력하면 해당 단어를 포함하는 파일을 출력
		 * */
		String[] filename= {"이것이 자바다.java","java의 정석.java","String.jpg","String 메서드.txt","array.txt"};
	
		//ex:java 검색 => 이것이 자바다.java, java의 정석.java 출력
		//ex:String 검색 => String.jpg, String 메서드.txt 출력
		//ex:txt 검색 => String 메서드.txt, array.txt 출력
		//ex:스트링 검색 => 검색 결과가 없습니다.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("검색어를 입력해주세요.");
		String a = scan.next();
		int cnt=0;
		for(String s : filename) {
			if(s.contains(a)) { 
			 System.out.println(s+" "); 
			 cnt++;
			 }
			 }if(cnt==0) {
				 System.out.println("검색 결과가 없습니다.");
				 }
			
		scan.close();
		
		
	}

}
