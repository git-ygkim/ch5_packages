package ch5_packages;
/*
	StringBuffer - 원본 값이 바뀐다. 
		; String	고정,		StringBuffer	가변
		
		. append(str)
		. delete(int start, int end)
 */

public class StringBuffer1 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Hello JAVA");
		StringBuffer sb2 = new StringBuffer("처음 시작하는 자바");

		System.out.println("sb1 문자길이: " + sb1.length());	//10
		System.out.println("sb1의 버퍼(객체)크기: " + sb1.capacity());	//26
		
		// insert(int a, str) a위치에 str 끼워넣기
		System.out.println("sb2에 문자끼워넣기: " + sb2.insert(8, "Power"));	//처음 시작하는 Power자바
		System.out.println(sb2);

		System.out.println("sb2의 8번째 문자: " + sb2.charAt(8));
		
		sb2.setCharAt(5, '되');
		System.out.println("sb2의 특정 문자 바꾸기: " + sb2);	//처음 시작되는 Power자바

		// 
		System.out.println("sb의 역순은: " + sb2.reverse());	
		System.out.println("sb의 역역순은: " + sb2.reverse());
	}

}
