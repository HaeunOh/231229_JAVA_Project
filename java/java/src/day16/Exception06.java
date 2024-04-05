package day16;


public class Exception06 {

	public static void main(String[] args) {
		//메서드에서 생성된 배열 출력
		
		try {
			makeArr(10, 2, 100);
			makeArr(-1, 5, 10);
			makeArr(5, 1, -1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		try {
			randomArr(new int[5], 2, 10);
			randomArr(null, 4, 7);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//메서드 생성
	/* 기능 : size를 매개변수로 입력받아 size만큼의 길이를 가지는 배열을 생성하여
	 * 랜덤값을 채워 배열을 리턴하는 메서드
	 * 
	 * ex) 10,start:1,cnt:100 입력 
	 * -> arr[10] 생성 후 10개의 index에 1~100사이의 랜덤값 채워서 배열 리턴
	 * 
	 * 예외1) size가 0보다 작다면 예외발생 (throw new)
	 * 예외2) cnt가 0보다 작다면 예외발생
	 * 
	 * */
	
	public static int[] makeArr(int num, int start, int cnt) {
		if(num<0) {
			throw new RuntimeException ("num이 0보다 작습니다.");
		}if(cnt<0) {
			throw new RuntimeException ("cnt가 0보다 작습니다.");
		}
		int arr[] = new int[num];
		for(int i=0; i<num; i++) {
			arr[i]=(int)(Math.random()*cnt)+start;
				System.out.print(arr[i]+" ");
		}
		System.out.println();
		return arr;
	}
	//메서드 생성
	/* 기능: 매개변수로 배열을 받아서 랜덤값을 채우는 메서드
	 * 랜덤값의 범위는 매개변수 입력 start(시작값), count(개수)
	 * 
	 * 예외1) 배열이 null이면 예외발생
	 * 예외2) 배열의 길이가 0보다 작다면 예외발생
	 * */
	
	public static void randomArr(int arr[], int start, int cnt) {
		if(arr==null) {
			throw new RuntimeException ("배열이 null입니다.");
		}if(arr.length<0) {
			throw new RuntimeException ("배열의 길이가 0보다 작습니다.");
				}
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*cnt)+start;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		}
		
	}
	

