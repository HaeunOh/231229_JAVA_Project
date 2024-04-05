package studentManager2;

public class Subject {
	/* 클래스 안에 선언 순서
	 * 멤버변수 > 생성자 > getter/setter > to String
	 * */
	private String subName; //과목
	private int subTime; //시
	private String subProfessor; //담당교수
	private String subScheduler; //시간표
	
	//생성
	public Subject() {}
	
	//과목명만 받는 생성자
	public Subject(String subName) {
		this.subName=subName;
	}

	//모두 다 넣는 생성자
	public Subject(String subName, int subTime, String subProfessor, String subScheduler) {
		super();
		this.subName = subName;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subScheduler = subScheduler;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getSubTime() {
		return subTime;
	}

	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}

	public String getSubProfessor() {
		return subProfessor;
	}

	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}

	public String getSubScheduler() {
		return subScheduler;
	}

	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}

	@Override
	public String toString() {
		return "[과목명:" + subName + ", 시수:" + subTime + ", 담당교수:" + subProfessor
				+ ", 시간표:" + subScheduler + "]";
	}
	
	
	
	
}
