package std;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class Student {
	//멤버변수 : 이름, 나이, 전화번호, (과목,점수를 담을 수 있는)map, 합계, 평균
	//생성자, 메서드, getter/setter, 출력 메서드
	//메서드 - 출력 메서드 (학생 정보, 과목 점수/합계/평균 (성적표) 출력
	//		map (과목,점수) 데이터를 추가 메서드 put
	//		map (과목,점수) 데이터를 삭제 메서드 remove
	//
		private String sdtName;
		private int sdtAge;
		private String sdtNum;
		private HashMap<String, Integer> map = new HashMap<>();
		int sum=0;
		double avg=0;
		int cnt=0;
		
		public Student () {};
		public Student (String sdtName, int sdtAge, String sdtNum) {
			this.sdtName=sdtName;
			this.sdtAge=sdtAge;
			this.sdtNum=sdtNum;
		};
		
		//출력메서드
		public void printStd() {
				
				System.out.println("━━━━━━━━━━━━━━━ 학생 정보 ━━━━━━━━━━━━━━━");
				System.out.println("이름: "+sdtName);
				System.out.println("나이: "+sdtAge);
				System.out.println("전화번호: "+sdtNum);
				if(map.size()!=0) {
					System.out.println("- - - - - - - - - 성 적 표  - - - - - - - ");
					System.out.println("과목: "+map.keySet()+"/ 점수: "+map.values());
					calc();
					System.out.println("합계: "+sum+"점");
					System.out.println("평균: "+avg+"점");
					
				}else {
					System.out.println("등록된 성적이 없습니다.");
				}
				
		}
			
		public void calc() {
				sum=0;
				avg=0;
		        for (int value: map.values()) {
		            sum += value;
		  
		        }

		     avg = sum / map.size();
		}
	
		
		public void addMap(String subName, int subScore) {
			map.put(subName, subScore);
		}
		
		public void removeMap(String subName) {
			map.remove(subName);
		}
		
		public String getSdtName() {
			return sdtName;
		}
		public void setSdtName(String sdtName) {
			this.sdtName = sdtName;
		}
		public int getSdtAge() {
			return sdtAge;
		}
		public void setSdtAge(int sdtAge) {
			this.sdtAge = sdtAge;
		}
		public String getSdtNum() {
			return sdtNum;
		}
		public void setSdtNum(String sdtNum) {
			this.sdtNum = sdtNum;
		}
		public HashMap<String, Integer> getMap() {
			return map;
		}
		public void setMap(HashMap<String, Integer> map) {
			this.map = map;
		}
		@Override
		public int hashCode() {
			return Objects.hash(avg, cnt, map, sdtAge, sdtName, sdtNum, sum);
		}
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj) //주소가 내 객체의 주소와 같다면 true
//
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass()) //클래스 정보가 다르다면 false
//				return false;
//			Student other = (Student) obj;
//			return Objects.equals(sdtName, other.sdtName); //이름만 같다면 true (같은객체로인식)
//			
//		}
		
		

}
