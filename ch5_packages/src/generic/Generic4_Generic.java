package generic;

class GStack3 <T> {
	int point;
	Object[] stack;
	
	//생성자
	public GStack3() {
		point = 0;
		stack = new Object[10];	// 생성자에서 배열 10개를 만드므로 객체 생성할때마다 자동으로 배열 10개가 생성됨
	}
	
	// string -> integer
	void push(T item) {
		if(point == 10) {
			return;
		}
		stack[point] = item;
		point++;
	}
	
	// string -> integer
	T pop() {
		if(point == 0) {
			return null;
		} 
		point--;
		return (T) stack[point]; 
		
	}
}


public class Generic4_Generic {

	public static void main(String[] args) {
		// 둘다 가능
//		GStack3 <Integer> st1 = new GStack3<>();
		GStack3 <Integer> st1 = new GStack3<Integer>();
		
		// 오토박싱이 되므로 100만 넣으면 된다.
//		st1.push(Integer.valueOf(100));
		st1.push(100);
		st1.push(200);
		st1.push(300);
		st1.push(400);
		st1.push(500);
		st1.push(600);
		st1.push(700);
		
		for(int i =0; i<7; i++) {
			System.out.println(st1.pop());
		}
		
		/*	출력값 : Stack - LIFO
		    700
			600
			500
			400
			300
			200
			100
		 */
		
		
		GStack3 <String> st2 = new GStack3();
		st2.push(new String("서울"));
		st2.push("부산");
		st2.push("대구");
		st2.push("대전");
		st2.push("광주");
		st2.push("충청");
		st2.push("경기");
		
		for(int i = 0; i < 6; i++) {
			System.out.println(st2.pop());
		}
		
		GStack3 <Float> st3 = new GStack3();
		st3.push(new Float(1.1));
		st3.push(1.2f);
		st3.push(1.3f);
		st3.push(1.4f);
		st3.push(1.5f);
		st3.push(1.6f);
		
		for(int i = 0; i < 6; i++) {
			System.out.println(st3.pop());
		}

		GStack3 <Character> st4 = new GStack3();
		st4.push('a');
		st4.push('b');
		st4.push('c');
		st4.push('d');
		st4.push('e');
		st4.push('f');
		st4.push('g');
		st4.push('h');
		st4.push('i');
		
		for(int i = 0; i < 9; i++) {
			System.out.println(st4.pop());
		}
		
				
	}
}
