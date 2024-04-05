package studentManager;


/* -Subject class: 하나의 수강과목 정보를 저장하는 클래스
	-과목코드, 과목명, 학점, 시간, 교수명, 학기, 강의장
	-멤버변수, 생성자, getter/setter, toString
 * */

public class Subject {
	private String name;
	private int code;
	private double credit;
	private String time;
	private String professor;
	private int term;
	private String classroom;
	
	public Subject () {}
	public Subject (String name, int code) {
		this.name=name;
		this.code=code;
		
	}
	
	public void insertSubject(String name, int code, int term, double credit, String professor, String classroom, String time) {
		this.name=name;
		this.code=code;
		this.term=term;
		this.credit=credit;
		this.professor=professor;
		this.classroom=classroom;
		this.time=time;
	} 
	
	
	
	@Override
	public String toString() {
		return name + " ("+code+")" + " / "+term+"학기 / "+credit+"학점 / "+professor+" 교수 / " + classroom+" / "+ time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}


}

