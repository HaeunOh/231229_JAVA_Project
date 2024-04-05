package day08;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lotto[] = new int[7]; //당첨번호
		int user[]= new int[6];//사용자 로또 번호
		
		randomArray(lotto);  
		randomArray(user);
		System.out.println("-----당첨 번호-----");
		printArray(lotto);
		System.out.println();
		System.out.println("-----사용자 번호-----");
		printArray(user);
		compare(lotto, user);
		
		System.out.println("------------------");
		int rank = lottoRank(lotto, user);
		if(rank==-1) {
			System.out.println("꽝입니다.");
		}else {System.out.println(rank+"등 당첨입니다.");}
	}

	/* 배열을 매개변수로 받아 1~45까지 랜덤수를 채워서 생성 (랜덤수는 서로 중복 불가능)
	 * 매개변수: 배열=> int arr[]
	 * 
	 * 	 * */
	public static void randomArray (int arr[]) {
		//배열을 받아서 배열에 랜덤 값을 중복없이 채우기
		//random==arr[i] false면 추가 -> 중복 없게하기
		int cnt=0; //while문에서 i역할을 할 변수
		while(cnt<arr.length) {
			int random=(int)(Math.random()*45)+1;
			if(!isContain(arr, random)) {
				arr[cnt]=random;
				cnt++;
			}
		}
	}
	
	//printArray 메서드
	public static void printArray(int arr[]) {
		if(arr.length == 7) {
			for(int i=0; i<arr.length-1; i++) {
				System.out.print(arr[i]+" ");
				
			} if(arr[6]>0) {
				System.out.print("[" +arr[6]+"]");
			}
			
		}else {
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
				
				
			}
			System.out.println();
			
		}
	}
	
	/* 중복 확인 메서드 => 등수 출력 메서드에도 활용
	 * 매개변수: 배열, 값
	 * 있으면 true, 없으면 fasle
	 * 리턴타입: boolean
	 * 메서드명: isContain*/
	
	public static boolean isContain (int arr[],int random) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==random) {
				return true;
			
			}
		}
		
		
		
		return false;
	}
	
	/* 등수확인 메서드
	 * 매개변수: lotto[], user[]
	 * 리턴타입: int => 등수
	 * 메서드명: lottoRank
	 * --당첨 기준--
	 * user번호 기준으로
	 * 6개 일치: 1등
	 * 5개 일치+보너스 번호 일치: 2등
	 * 5개 일치: 3등
	 * 4개 일치: 4등
	 * 3개 일치: 5등
	 * 나머지는 꽝
	 * */
	
	public static void compare (int lotto[],int user[]) {
		int cnt=0;
		int bonus=0;
		for(int i=0; i<user.length; i++) {
			for(int j=0; j<lotto.length; j++) {
				if(user[i]==lotto[j]) {
					cnt++;
					if(user[i]==lotto[6]) {
						cnt--;
						bonus++; 
						
											//숫자가 몇개 겹치는지 알기 위한 for문
					}
				}
			}
		} 									//for문 끝나고 if~else문 돌리기
		if(cnt==6) {
			System.out.println("1등!");
		}else if(cnt==5 && bonus==1) {
			System.out.println("2등!");
		}else if(cnt==5) {
			System.out.println("3등!");
		}else if(cnt==4) {
			System.out.println("4등!");
		}else if(cnt==3) {
			System.out.println("5등!");
		}else {
			System.out.println("꽝!");
		}
		
	}

	public static int lottoRank (int lotto[], int user[]) {
		//lotto=7개, user=6개
		//lotto와 user는 개수가 다르기 때문에 배열이 바뀌어서 들어온다면 잘못된 값으로 리턴 "-1"
		if (lotto.length<=user.length) {
			return -1;
		}
		
		int cnt=0; //일치하는 개수를 세기 위한 변수
		for(int i=0; i<user.length; i++) { //로또의 보너스번호를 제외하고 돌렸다는 뜻
			if(isContain(user, lotto[i])) {
				cnt++;
			}
		}
		
		switch(cnt) {
		case 6: return 1;
		case 5: 
			if(isContain(user, lotto[lotto.length-1])) {
				return 2;
			}else {return 3;}
			
		case 4: return 4;
		case 3: return 5;
		default:
			return -1;
		}
	}
	
	
	
	
	
}
