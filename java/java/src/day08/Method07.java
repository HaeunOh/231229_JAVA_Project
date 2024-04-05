package day08;

public class Method07 {

	public static void main(String[] args) {
		/*로또 번호 생성*/
		
		int lotto[]=new int[7]; // 당첨번호
		int user[]=new int[6]; // 사용자 로또번호
		
		System.out.println("----로또 당첨 번호----");
		printArray(lotto(lotto));
		System.out.println();
		System.out.println("----사용자 추첨 번호----");
		printArray(lotto(user));

	}
	//배열 프린트 메서드
	public static void printArray (int arr[]) {
		for(int i=0; i<arr.length; i++) {  
			System.out.print(arr[i]+" ");
						
		}	
	
	}
	/* 배열을 매개변수로 받아서 1~45까지 랜덤수를 채워서 생성
	 * lotto와 user를 둘 다 랜덤수로 채워주기
	 * 단 숫자가 중복되면 안됨----------->
	 * */
	public static int[] lotto(int arr[]) {
		
	for(int i=0; i<arr.length; i++) {
		arr[i] =(int)(Math.random()*45)+1;
			if(i>0) {
				while(arr[i]==arr[i-1]) {
					arr[i] =(int)(Math.random()*45)+1;
				}
			}
		} return arr;
	}

	
	
	/* 중복 확인 메서드
	 * 매개변수: 배열, 값
	 * 있으면 true, 없으면 false*/
	public static boolean contains (int[]arr, int num) {
		for (int i:arr) {
			if(i==num) {
				return true;
			}
		}
		return false;
	}
	
	
}
	