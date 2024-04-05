package day21;

import java.io.IOException;

public class File01 {

	public static void main(String[] args) {
		/* java.io.* 에서 제공하는 클래스들은 try~catch . throws를 해줘야 함
		 * IOStream : 단방향으로 데이터가 흘러들어가는 형태
		 * 자바는 입력스트림, 출력스트림을 통해 데이터를 입출력한다.
		 * 다양한 장치에 독립적이고 일관성 있는 입출력을 유지하기 위해
		 * 입출력 스트림을 통해 일관성을 제공.
		 * 
		 * 두 가지 형태의 스트림
		 * 1. 바이트 형태의 스트림 : 기본(문자, 그림, 멀티미디어)
		 * 2. 문자 형태의 스트림 : 문자만 입출력할 때 사용
		 * 
		 * 바이트 스트림
		 * - 입력(InPutStream) : fileInPutStream, BufferedInPutStream, DataInPutStream...
		 * - 출력(OutPutStream) : fileOutPutStream, BufferedOutPutStream, DataOutPutStream...
		 * 
		 * 문자 스트림
		 * - 입력(Reader) : FileReader, BufferedReader, InPutStreamReader...
		 * - 출력(Writer) : FileWriter, BufferedWriter, PrintWriter...
		 * 
		 * 기반스트림 / 보조스트림
		 * 기반스트림 : 직접 자료를 읽고 쓰는 기능이 있는 스트림
		 * 	-FileInPutStream, FileOutPutStream, FileReader, FileWriter
		 * 보조스트림 : 직접 읽고 쓰는 기능은 없지만 추가적인 기능을 더해주는 스트림
		 * 	-InputStreamReader, Buffered~
		 * 
		 * */
		
		//표준 출력(모니터=콘솔) 스트림
		System.out.println("print");
		
		//표준 입력(키보드) 스트림
		try {
			//한번에 한 바이트씩만 읽기
			int b = System.in.read();
			System.out.println("Read() > "+b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//표준 에러 출력 스트림
		System.err.println("error");
	}

}
