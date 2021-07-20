package generic;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		
		hs.add("임꺽정");
		hs.add("홍길동");
		hs.add("이순신");
		hs.add("홍길동");
		hs.add("임꺽정");
		
		// HashSet은 인덱스가 없어 for문으로 출력이 불가능함. get 메소드 자체가 없음
//		for(int i = 0; i < hs.size(); i++) {
//			System.out.println(hs.get(i));
//		}
		
		// 따라서 아래와 같이 출력해야함
		for(String name: hs) {
			System.out.println(name);
		}
		System.out.println("사이즈: " + hs.size());
		
		
		/*
		 * 출력 결과 : Hashset은 중복을 인정하지 않음
		 * 
		 * 홍길동
		 * 이순신
		 * 임꺽정
		 * 사이즈: 3
		 */
		
		// 따라서 순환자라는 클래스가 존재함
		// Iterator가 가지는 메소드가 있음. hasNext() 라는 값이 있음 
//		Iterator<E> it = hs.iterator();
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		
	}

}
