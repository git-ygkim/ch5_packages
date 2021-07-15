package generic;

class GStack1 {
	int point;
	Object[] stack;
	
	//생성자
	public GStack1() {
		point = 0;
		stack = new Object[10];	// 생성자에서 배열 10개를 만드므로 객체 생성할때마다 자동으로 배열 10개가 생성됨
	}
	
	void push(String item) {
		if(point == 10) {
			return;
		}
		stack[point] = item;
		point++;
	}
	
	String pop() {
		if(point == 0) {
			return null;
		} 
		point--;
		return (String) stack[point]; 
		
	}
}

public class Generic2_String {

	public static void main(String[] args) {

		GStack1 st = new GStack1();
		st.push("서울");
		st.push("부산");
		st.push("광주");
		st.push("대전");
		st.push("강원");
		st.push("충청");
		
		for(int n = 0; n < 6; n++) {
			System.out.println(st.pop());
			
		}
		
	}

}
