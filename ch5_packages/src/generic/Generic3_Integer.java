package generic;

class GStack2 {
	int point;
	Object[] stack;
	
	//생성자
	public GStack2() {
		point = 0;
		stack = new Object[10];	// 생성자에서 배열 10개를 만드므로 객체 생성할때마다 자동으로 배열 10개가 생성됨
	}
	
	// string -> integer
	void push(Integer item) {
		if(point == 10) {
			return;
		}
		stack[point] = item;
		point++;
	}
	
	// string -> integer
	Integer pop() {
		if(point == 0) {
			return null;
		} 
		point--;
		return (Integer) stack[point]; 
		
	}
}

public class Generic3_Integer {
	public static void main(String[] args) {
		GStack2 st = new GStack2();
		st.push(100);
		st.push(200);
		st.push(300);
		st.push(400);
		st.push(500);
		st.push(600);
		st.push(700);
		
		for(int i = 0; i < 7; i++) {
			System.out.println(st.pop());
		}
		
			
	}

}
