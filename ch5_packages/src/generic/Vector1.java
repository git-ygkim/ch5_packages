package generic;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();

		// 보통은 vector를 많이 사용 / 속도적인 면에서는 array가 빠르긴 하지만 vector를 사용함
		v.add(5);
		v.add(10);
		v.add(-4);
		v.add(276);

		v.add(2, 1000);
		v.add(5, 2000);
		
		Integer value = v.get(0);
		int val = value.intValue();
		int num = v.get(0);

		System.out.println("언박싱: " + val);
		System.out.println("자동언박싱: " + num);
		System.out.println("벡터사이즈: " + v.size());	// 배열은 length, 벡터는 size
		System.out.println("벡터용량: " + v.capacity());
		System.out.println("마지막요소: " + v.lastElement());
		
		// 지우기
		v.remove(0);
		System.out.println("지워진 첫번째 값이 있나요? " + v.get(0));

		// 한번에 지우기
		v.clear();
		System.out.println("다 지워졌나요? " + v.isEmpty());
	}

}
