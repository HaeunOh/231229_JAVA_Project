	package studentManager2;

public class Student {
	/* -학번, 이름, 나이, 전화번호, 주소, 수강과목
	 * -> 학번이나 전화번호의 변수를 int로 주면 안되는 이유?
	 * int로 넣는 숫자는 연산을 목적으로 선언하는 것이기 때문에 학번이나 전화번호같이
	 * 잠정적으로 절대적인 값은 String으로 선언.
	 * (but, 나이같이 한 해가 지났을때 cnt++가 되어야 되는 수는 int로 선언함.)
	 * 
	-멤버변수, 생성자, getter/setter, toString
	-멤버변수에 학생이 듣고자하는 과목을 저장 Subject[]
	-메서드
		-학생정보 출력 메서드 //내 정보만 출력하는 기능, interface에 있는 기능과 다름
		-수강과목 추가 메서드
		-수강과목 삭제 메서드
		-수강과목 출력 메서드
	 * */
	private String sdtName;
	private String sdtNum;
	private String sdtPhone;
	private Subject[] subjectList = new Subject[5]; 
	private int cnt; //Subject 배열의 index역할
	
	//생성자
	public Student() {}
	public Student(String sdtNum, String sdtName, String sdtPhone) {
		this.sdtNum=sdtNum;
		this.sdtName=sdtName;
		this.sdtPhone=sdtPhone;
	}
	
	//메서드
	//학생정보 출력 메서드 
	//toString써도됨
	public void stdPrint() {
		//System.out.println("--학생 정보--");
		System.out.println("학생명(학번):"+sdtName+"("+sdtNum+") / 전화번호: "+sdtPhone);
	}
	
	//수강과목 출력 메서드 : 배열로 여러개 존재 	(for문)
	public void subPrint() {
		//Subject 클래스의 toString을 호출해서 출력
		if(cnt==0) {
			System.out.println("수강중인 과목이 없습니다.");
			return;
		}
		for(int i=0; i<cnt; i++) {
			System.out.println("--수강 과목 정보--");
			System.out.println(subjectList[i]);
			
		}
		//toStirng은 객체의 내용이 문자로 리턴 sysout(객체) => toString 호출
		
	}
	
	//수강과목 추가 메서드
	//매개변수: 수강과목 객체(Subject) => subjectList배열에 담기
	public void insertSubject(Subject sub) {
		//배열이 다 찼다면 배열 늘려주기
		//but 배열은 길이를 정하면 변경 불가능하므로
		//더 긴 길이의 배열을 생성하여 배열복사 후 배열 바꾸기
		if(cnt==subjectList.length) {
			Subject[] tmp = new Subject[subjectList.length+5];
			//배열복사
			System.arraycopy(subjectList, 0, tmp, 0, cnt);
			subjectList=tmp;
		}
		//객체(Subject) => subjectList배열에 담기
		subjectList[cnt]=sub;
		cnt++;
	}
	
	//수강과목 삭제 메서드
	public void deleteSubject(String subName) {
		//수강과목 배열에서 subName을 검색하여 삭제해야 함
		int index= -1;
		if(subName==null) {
			return;
		}
		for(int i=0; i<cnt; i++) {
			if(subjectList[i].getSubName().equals(subName)) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("찾는 과목이 없습니다.");
			return;
		}
		//삭제: 찾은 위치부터 뒷번지를 앞번지로 옮기는 것, 끝번지는 null처리
		for(int i=index; i<cnt-1; i++) {
			subjectList[i]=subjectList[i+1];
		}
		//끝번지 null처리 => cnt-1번지
		subjectList[cnt-1]=null;
		//한과목 삭제 -> 과목 개수가 줄어듦
		cnt--;
	}
	
	
	
	public String getSdtName() {
		return sdtName;
	}
	public void setSdtName(String sdtName) {
		this.sdtName = sdtName;
	}
	public String getSdtNum() {
		return sdtNum;
	}
	public void setSdtNum(String sdtNum) {
		this.sdtNum = sdtNum;
	}
	public String getSdtPhone() {
		return sdtPhone;
	}
	public void setSdtPhone(String sdtPhone) {
		this.sdtPhone = sdtPhone;
	}
}
