package generic;

class Stack4 <T> {
	int point;
	Object[] stack;
	
	//생성자
	public Stack4() {
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


public class Generic6 {

	// method를 generic으로 선언
	//                리턴 타입   메소드명()
//	public static <T> Stack4<T> reverse(Stack4<T> a) {
	public static <T> Stack4<T> reverse(Stack4<T> a) {
		
		Stack4<T> s = new Stack4<T>();
		while(true) {
			T tmp = a.pop();
			if(tmp == null) {
				break;
			} else {
				s.push(tmp);
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		
		Stack4<Double> s4 = new Stack4();
		// 입력
		for(int i = 0; i < 5; i++) {
			s4.push(new Double(i));
		}

		// stack을 역순으로 만듬
		s4 = reverse(s4);
		for(int i =0; i < 5; i++) {
			System.out.println(s4.pop());
		}
	}

}
