package day04;

public class For07 {

	public static void main(String[] args) {
		/* 이중 For문 -> for문을 두번 돌리는 것 
		 * for (int i=1; i<=5; i++){                    //i가 1일때 j가 5번, i가 2일때 j가 5번...
		 * 		 for(int j=1; j<=5; j++){               //
		 * 				실행문; 5 5 5 5 5 =>25번 실행}
		 * }
		 * 별찍기
		 * ***** i=1 j=5
		 * ***** i=2 j=5
		 * ***** i=3 j=5
		 * ***** i=4 j=5
		 * ***** i=5 j=5
		 * 
		 * 
		 * */
		
		for(int i=1; i<=5; i++) { //줄
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}System.out.println();//한 줄 끝나면 줄바꿈
		}  
		
		System.out.println("-------------------");
		
		/* *       i=1, j=1
		 * **      i=2, j=2
		 * ***     i=3, j=3
		 * ****    i=4, j=4
		 * *****   i=5, j=5
		 */
		
		for(int i=1; i<=5; i++) { 
			for(int j=1; j<=i; j++ ) {
				System.out.print("*");
			}System.out.println();
		}  
		System.out.println("-------------------");
		
		/* ***** i=1, j=5
		 * ****  i=2, j=4
		 * ***   i=3, j=3
		 * **    i=4, j=2
		 * *     i=5, j=1
		 * */
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>i-1; j--) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println("-------------------");
		
		/*     *  i=1 0=4 j=1
		 *    **  i=2 0=3 j=2
		 *   ***  i=3 0=2 j=3
		 *  ****  i=4 0=1 j=4
		 * *****  i=5 0=0 j=5
		 * */
		for(int i=0; i<5; i++) {
			for(int j=4; j>=0; j--) {
				if(j<=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
		}
		System.out.println("-------------------");
		
		/*     *   
		 *    ***
		 *   ***** 
		 *  *******
		 * *********
		 * 
		 * */
		System.out.println("-------------------");
		for(int i=0; i<6; i++) {
			//공백
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			} //별
			for(int k=1; k<=(i*2)-1; k++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println("-------------------");
		
		/* 123
		 * 456
		 * 789
		 * 3줄씩 3개 출력
		 * */
	
		int cnt=0; //123.456.789가 카운트변수
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				cnt++;
				System.out.print(cnt+" ");
			}
				System.out.println();
	
		}
			
			
		}
		
}
	
		
		
	

