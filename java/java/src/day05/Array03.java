package day05;

public class Array03 {

	public static void main(String[] args) {
		
		int arr[]=new int[] {10,56,78,89,48,62,93,50};
		/* arr 배열의 합계와 평균 출력
		 * 최대값/최소값 출력
		 * */
		
		
		/* 
		 * int sum = 0;
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
						}if(arr[i]<min) {
							min=arr[i];
						}
			sum=sum+arr[i];	
		}
		double avg=sum/(double)arr.length;
		
		
		 System.out.println("합계:"+sum); 
		 System.out.println("평균:"+avg);
		 System.out.println("최대값:"+max);
		 System.out.println("최소값:"+min); */
		
		int sum=0;
		double avg =0;
		//성적 데이터 (0~100점)
		int max= arr[0]; //가장 큰 값을 넣기 위한 변수
		int min= 100; //가장 작은 값을 넣기 위한 변수
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			//for 문 안에 if문 넣어서 최대/최소값 구하기
			/* if(max<arr[i]) { //max값이 10으로 시작해서 93으로 끝남
				max=arr[i];
			}
			if(min>arr[i]) { //else if로 설정하면 이 식으로 넘어오질 않으니 if로 설정
				min=arr[i];  //min값이 100으로 시작함
			} */
			
			//Math클래스 이용해서 최대/최소값 구하기 *Math클래스가 for문 안에 들어가야함!!!!
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
			
		}
		avg=sum/(double)arr.length;
		System.out.println("합계:"+sum+"/ 평균:"+avg);
		System.out.println("최대값:"+max+"/ 최소값:"+min);
		
		
		
		
		
		
		
		
	}


}
