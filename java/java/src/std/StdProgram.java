package std;

import java.util.Scanner;

public interface StdProgram {
	void printStd(); //학생 정보 출력
	void addStd(Scanner scan);  //학생 추가
	void modStd(Scanner scan); //학생 정보 수정
	void delStd(Scanner scan); //학생 삭제
	void searchStd(Scanner scan); //학생 검색
	
	void addSub(Scanner scan); //과목 추가
	void modSub(Scanner scan); //과목 정보 수정
	void delSub(Scanner scan); //과목 삭제
	
}
