package day18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class WordManager implements Program{
	HashMap<String, String> map = new HashMap<>();


	@Override
	public void insertWord(Scanner scan) {
		System.out.println("단어를 입력하세요. 》》》");
		String word = scan.next();
		System.out.println("단어의 의미를 입력하세요. 》》》");
		String mean = scan.next();
		
		map.put(word, mean);
		System.out.println("단어가 등록되었습니다.");
	}

	@Override
	public void serchWord(Scanner scan) {
		System.out.println("검색할 단어를 입력하세요. 》》》");
		String serchWord = scan.next();
		
		for(String key :map.keySet()) {
		for(int i=0; i<map.size(); i++) {
			if(!map.containsKey(serchWord)) {
				System.out.println("검색 결과가 없습니다.");
				}
			}
		}if(map.containsKey(serchWord)) {
			System.out.println(serchWord+" : "+map.get(serchWord));
		}
	}

	@Override
	public void correctionWord(Scanner scan) {
		System.out.println("수정할 단어를 입력하세요. 》》》");
		String cWord = scan.next();
		System.out.println("수정할 단어의 의미를 입력하세요. 》》》");
		String cMean = scan.next();
		
		map.put(cWord, cMean);
		System.out.println("수정이 완료되었습니다.");
		
	}

	@Override
	public void printWord() {
		int cnt=0;
		System.out.println("【                 단어장                  】");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			cnt++;
			System.out.println(cnt+". "+key+" : "+map.get(key));	
		}
		System.out.println();
		System.out.println("단어장 보유 단어: "+cnt+"개");
		System.out.println();
		System.out.println();
		
	}

	@Override
	public void deleteWord(Scanner scan) {
		System.out.println("삭제할 단어를 입력하세요. 》》》");
		String delWord = scan.next();
		if(map.containsKey(delWord)) {
			map.remove(delWord);
		}
		System.out.println("해당 단어가 삭제되었습니다.");
		
	}

	@Override
	public void basicWord() {
		map.put("cup","컵");
		map.put("world","세계");
		map.put("green","초록색");
		map.put("screen","화면");
		map.put("human","사람");
		
	}

	@Override
	public void printFile() throws IOException {
//		SortedMap<String, Integer> map = new TreeMap<>((s1, s2) -> s1.compareTo(s2));
		System.out.println("단어장 파일을 출력합니다 . . .");
	
		FileWriter fw = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuffer sb = new StringBuffer();
		
		String data = null;
		sb.append("━━━━━━━━━━ 단어장 ━━━━━━━━━━");
		sb.append("\r\n");
		
		
		
			for(String key : map.keySet()) {
				sb.append(key+": "+map.get(key));
				sb.append("\r\n");
				
			}
			
			data = sb.toString(); //StringBuffer 객체여서 String 객체로 변환
			System.out.println(data);
			bw.write(data);
			if(bw != null) {
				bw.close();
			}
			
			if(fw != null) {
				fw.close();
			}
//		
//		Iterator<String> it = map.keySet().iterator();
//		while(it.hasNext()) {
//			List<String> keyList = new ArrayList<>(map.keySet());
//			keyList.sort(String::compareTo);
//			String key = it.next();
//				String word=key+": "+map.get(key)+"\r\n";
//				fw.write(word);
//			}
//		if(fw != null) {
//			fw.close();			
//		}
//		
//		System.out.println("단어장 파일이 출력되었습니다.");
		
	}
	

}
