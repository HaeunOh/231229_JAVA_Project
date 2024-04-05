package studentManager;

import java.util.Scanner;

public interface Program {
	/* 	-학생 리스트 출력 기능 void printStudent();
		-학생 등록 기능 void insertStudent(Scanner scan);
		-학생 검색 기능 void serchStudent(Scanner scan);
		-수강 신청 기능 void registerSubject(Scanner scan);
		-수강 철회 기능 void deleteSubject(Scanner scan);
	 * */
	void printStudent();
	void insertStudent(Scanner scan);
	void serchStudent(Scanner scan);
	void registerSubject(Scanner scan);
	void deleteSubject(Scanner scan);
	
	
}
