package generic;


// generic 에서는 무조건 객체만 가능. 박싱해서 사용해야함. 
class Queue {
	// try1
//	// push
//	Integer[] push(Integer[] data) {
//		
//		for(int i = 0; i < data.length; i++) {
//			data[i] = Integer.valueOf(i); 	// i는 int 이므로 Integer 타입이 아님. 
//		}
//		return data;
//	}
//	
//	// pop
//	void pop(Integer[] data) {
//		for(int i = 0; i < data.length; i++) {
//			System.out.println(data[i]);	
//		}
//	}

	// try2
//	// push
//	Float[] push(Float[] data) {
//		
//		for(int i = 0; i < data.length; i++) {
//			data[i] = Float.valueOf(i); 	// i는 int 이므로 Integer 타입이 아님. 
//		}
//		return data;
//	}
//	
//	// pop
//	void pop(Float[] data) {
//		for(int i = 0; i < data.length; i++) {
//			System.out.println(data[i]);	
//		}
//	}

	
//	// try3
//	// push
//	Character[] push(Character[] data) {
//		
//		for(int i = 0; i < data.length; i++) {
//			data[i] = Character.valueOf(i); 	// i는 int 이므로 Integer 타입이 아님. 
//		}
//		return data;
//	}
//	
//	// pop
//	void pop(Character[] data) {
//		for(int i = 0; i < data.length; i++) {
//			System.out.println(data[i]);	
//		}
//	}
	
	// try4
	// push
	String[] push(String[] data) {
		
		for(int i = 0; i < data.length; i++) {
			data[i] = String.valueOf("번따클럽" + i); 	// i는 int 이므로 Integer 타입이 아님. 
		}
		return data;
	}
	
	// pop
	void pop(String[] data) {
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);	
		}
	}
	
}


public class Generic1 {

	public static void main(String[] args) {
		
		// try1
//		Integer[] data1 = new Integer[10];	// 배열 생성
//		Queue queue1 = new Queue();	//위 클래스의 객체 생성
//		queue1.push(data1);
//		queue1.pop(data1);

		// try2
//		Float[] data2 = new Float[10];	// 배열 생성
//		Queue queue1 = new Queue();	//위 클래스의 객체 생성
//		queue1.push(data2);
//		queue1.pop(data2);

//		// try3
//		Character[] data3 = new Character[10];	// 배열 생성
//		Queue queue1 = new Queue();	//위 클래스의 객체 생성
//		queue1.push(data3);
//		queue1.pop(data3);

		// try4
		String[] data4 = new String[10];	// 배열 생성
		Queue queue1 = new Queue();	//위 클래스의 객체 생성
		queue1.push(data4);
		queue1.pop(data4);

	}

}
