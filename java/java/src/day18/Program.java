package day18;

import java.io.IOException;
import java.util.Scanner;

public interface Program {
	void basicWord();
	void insertWord(Scanner scan);
	void serchWord(Scanner scan);
	void correctionWord(Scanner scan);
	void printWord();
	void deleteWord(Scanner scan);
	void printFile() throws IOException;
}
