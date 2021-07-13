package ch5_packages;

/*
 * Wrapper class
 * - int			Integer
 * - char			Character
 * - float			Float
 * - long			Long
 * - 기본 데이터 타입	클래스
 */

public class Wrapper {

	public static void main(String[] args) {

		int num1 = 3;
		
		Integer num2 = new Integer(3);	// 박싱
		int num3 = num2.intValue();		// 언박싱
		Integer num4 = Integer.valueOf(num3);	//박싱
		
		int num5 = num2;		// 오토 언박싱
		Integer num6 = num5;	// 오토박싱
		
		Integer num7 = 100;
		int num8 = num7;
		
		//--------------------------------
		
		Character c1 = new Character('a');
		char c2 = c1.charValue();
		char c3 = c1;
		Character c4 = Character.valueOf(c3);
		Character c5 = c3;
		
		//--------------------------------
		
		Float f1 = new Float(3.14);
		float f2 = f1.valueOf(f1);
		float f3 = f1;
		Float f4 = Float.valueOf(f3);
		Float f5 = f4;
		
		//--------------------------------
		
		
		int n1 = Integer.parseInt("123");
		String str1 = Integer.toString(n1);
		
		float n2 = Float.parseFloat("3.14");
		String str2 = Float.toString(n2);
	}

}
