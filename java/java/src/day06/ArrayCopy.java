package day06;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {1,2,3,4}; //new를 통해서 객체를 생성
		int arr1[]=arr; //arr를 arr1에 복사, 한 객체를 두개의 변수가 공유
		int arr2[]= new int[5];
		//두 객체의 주소를 확인
		//System.out.println(arr);
		//System.out.println(arr1); //두 주소가 동일하게 출력됨
		//System.out.println(arr2);
		//arr와 arr1의 객체 내용물을 같게 하기 위해서는 for문으로 복사해줘야함 arr[i]=arr1[i]
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		//arr의 값을 arr2로 복사
		for(int i=0; i<arr.length; i++) {
			arr2[i+1]=arr[i];
		}
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		//arr를 arr3으로 복사
		//arr3은 10개의 데이터를 담을 수 있는 배열로 생성
		
		int arr3[]=new int[10];
		for(int i=0; i<arr.length; i++) {
			System.arraycopy(arr, 0, arr3, 0, arr.length); //배열 복사 명령어: System.arraycopy(이전 배열, 시작번지, 복사할 새 배열, 시작번지, 개수)
			for(int s:arr3){
				System.out.print(s+" ");
			}
		}
//			arr3[i]=arr[i];
//		}
//		for(int num : arr3) {
//			System.out.print(num+" ");
	
		
		
	}
}
