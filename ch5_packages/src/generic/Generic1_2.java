package generic;


// generic 에서는 무조건 객체만 가능. 박싱해서 사용해야함. 
class Queue1 <T> {
	
//	// try1
//	// push
//	T[] push(T[] data) {
//		
//		for(int i = 0; i < data.length; i++) {
//			data[i] = (T)("번따클럽" + i); 	// i는 int 이므로 Integer 타입이 아님. 
//		}
//		return data;
//	}
//	
//	// pop
//	void pop(T[] data) {
//		for(int i = 0; i < data.length; i++) {
//			System.out.println(data[i]);	
//		}
//	}

	// try2
	// push
	T[] push(T[] data) {
		
		for(int i = 0; i < data.length; i++) {
			data[i] = (T)Float.valueOf(i); 	// i는 int 이므로 Integer 타입이 아님. 
		}
		return data;
	}
	
	// pop
	void pop(T[] data) {
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);	
		}
	}
	
}


public class Generic1_2 {

	public static void main(String[] args) {
		

//		// try1
//		String[] data5 = new String[10];	// 배열 생성
//		Queue1 <String> queue5 = new Queue1<>();	//위 클래스의 객체 생성
//		queue5.push(data5);
//		queue5.pop(data5);

		// try1
		Float[] data5 = new Float[10];	// 배열 생성
		Queue1 <Float> queue5 = new Queue1<>();	//위 클래스의 객체 생성
		queue5.push(data5);
		queue5.pop(data5);

	}

}
