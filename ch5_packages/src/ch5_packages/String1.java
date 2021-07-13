package ch5_packages;

/*
	String 클래스 
	
 */
public class String1 {

	public static void main(String[] args) {

		String str1 = "Java Korea";
		String str2 = new String("Java Korea");
		String str3 = str2.intern();	// 객체 > 리터럴
		String str4 = new String("Java Korea");
		
		System.out.println("s1과 s2가 같은 장소? " + (str1 == str2));	// false
		System.out.println("s1과 s3가 같은 장소? " + (str1 == str3));	// true
		System.out.println("s2과 s4가 같은 장소? " + (str2 == str3));	// false

		String str5 = "Apple";
		String str6 = "APPLE";
		
		System.out.println(str5.equals(str6));	// false	// 대소문자 구분하여 비교
		System.out.println(str5.equalsIgnoreCase(str6));	//true	// 대소문자 구분하지 않고 비교
		System.out.println(str1.startsWith("JAVA"));	//false	// "괄호"안에 문자로 시작하고 있는가?	//대소문자 구분
		System.out.println(str1.startsWith("Java"));	//true	// "괄호"안에 문자로 시작하고 있는가?

		String str7 = "처음 시작하는 자바";
		System.out.println(str1.substring(5,7));	//ko	//5이상 7미만 인덱스 출력		//인덱스의 특별한 위치 추출
		System.out.println(str7.concat("와 실습 프로그램"));	// 처음 시작하는 자바와 실습 프로그램
		System.out.println(str7);	
		
		System.out.println(str7.replace("자바", "JAVA"));	// 처음 시작하는 자바와 실습 프로그램
		System.out.println(str7);	// string 클래스는 replace와 concat 메소드로 변경한 값이 저장되지 않음
//		String s1, s2;
//		for(int i = 0; i < 10; i++) {
//			s1 = str7.substring(i,i+1);
//			s2 = str7.substring(i+1);
//			System.out.println(s2+s1);
//		}
	
		String [] array = {"IMF", "제주도", "자바도사", "한글나라", "Computer", "모카", "JAVA"};
		for(int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i].compareTo(array[j]) > 0) {	// 같으면 0, 적으면 음수
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
				}
			}
			System.out.print(array[i] + " ");
		}
	
	
	}

}
