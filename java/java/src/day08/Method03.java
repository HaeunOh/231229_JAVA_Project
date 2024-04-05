package day08;

public class Method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMulti(9);
		
	}
	//정수 (2~9중 하나)에 해당하는 구구단 출력 메서드
	//ex) 매개변수:2=>구구단 2단이 쫙 콘솔에 찍히는 메서드
	//출력: 리턴이 없음. => 리턴타입: void
	public static void gugudan (int num) {
		if (num>1) {
			System.out.println(num+"단");
			System.out.println();
			System.out.println(num+"x"+"1="+(num*1));
			System.out.println();
			System.out.println(num+"x"+"2="+(num*2));
			System.out.println();
			System.out.println(num+"x"+"3="+(num*3));
			System.out.println();
			System.out.println(num+"x"+"4="+(num*4));
			System.out.println();
			System.out.println(num+"x"+"5="+(num*5));
			System.out.println();
			System.out.println(num+"x"+"6="+(num*6));
			System.out.println();
			System.out.println(num+"x"+"7="+(num*7));
			System.out.println();
			System.out.println(num+"x"+"8="+(num*8));
			System.out.println();
			System.out.println(num+"x"+"9="+(num*9));
			
		}
		
	}
	public static void printMulti(int num) {
		for(int i=1; i<=9; i++) {
			
			System.out.println(num+"x"+i+"="+(num*i));
			}
		}
	
}
