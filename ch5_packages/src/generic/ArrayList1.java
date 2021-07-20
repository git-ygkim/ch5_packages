package generic;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<>();
		
		a.add("홍길동");
		a.add("이순신");
		a.add("강감찬");
		
		
		System.out.println(a.get(0));
		for(int i = 0; i < a.size(); i++ ) {
			System.out.println(a.get(i));
		}
		
		System.out.println("*************");
		a.remove(0);
		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		a.clear();
		System.out.println("요소 갯수: " + a.size());
		
	}

}
