package generic;

import java.util.Iterator;
import java.util.TreeSet;

// 그러나 hash set을 더 많이 씀
public class TreeSet1 {

	public static void main(String[] args) {

		TreeSet<String> tr = new TreeSet<>();
		
		tr.add("가");
		tr.add("나");
		tr.add("다");
		tr.add("라");
		tr.add("나");
		tr.add("다");
		tr.add("다");
		tr.add("나");
		tr.add("가");
		
		Iterator<String> it = tr.iterator();
		// Treeset은 확장된 for문 사용 불가
//		for(String name: it) {
//		}

		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		
		/*
		 * 출력 결과 : 중복 제거 / 가나다 순 정렬되어 노출
		 * 가
		 * 나
		 * 다
		 * 라
		 * 
		 */
	}

}
