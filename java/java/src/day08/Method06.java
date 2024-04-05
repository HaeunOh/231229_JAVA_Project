package day08;

public class Method06 {

	public static void main(String[] args) {
		
		/*주어진 정수 배열을 콘솔에 출력하는 메서드*/
		int arr[] = new int[] {1,8,7,10,9,15,30,7,2,50,20,22,80,9,6};
		//int arr1[] = new int
		
		printArray(arr);
		System.out.println("---정렬 후 배열 리턴---");
		printArray(sortArray1(arr));
		System.out.println("---랜덤 array[10] 출력---");
		printArray(sortArray1(randomArray()));
		

	}
	
	/*주어진 정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수: 배열
	 * 리턴타입: 출력만 함 => void
	 * 메서드명: printArray
	 * 5개씩 한 줄에 나열
	 * */
	public static void printArray (int arr[]) {
		int cnt=0;
		for(int i=0; i<arr.length; i++) {  
			System.out.print(arr[i]+" ");
			cnt++;
			if(cnt%5==0) {
				System.out.println();
				
			}
		}	
	
	}
	
	/* 배열이 주어지면 배열을 오름차순하는 메서드
	 * 매개변수: 배열
	 * 리턴타입: void
	 * 메서드명: sortArray
	 * */
	public static int[] sortArray1 (int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {				
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
		
	}
	
	/* 메서드 안에서 randomArray 라는 배열을 생성 [10]개 짜리
	 * 랜덤값을 채우고 (1~50까지의 랜덤수)
	 * 해당배열을 리턴 -> 메인에서 printArray(sortArray1(arr)); 로 찍어주기
	 * */
	public static int[] randomArray() {
		int arr[]=new int[10];
		for(int i=0; i<arr.length; i++) {
		arr[i] =(int)(Math.random()*50)+1;
		 
		}return arr;
	}
	
	
	
	
	
}

