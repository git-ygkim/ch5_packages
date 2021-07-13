package ch5_packages;

import java.util.StringTokenizer;

/*
	StringTokenizer - 토큰으로 분류하고 나면 배열로 저장을 함. 
		. countTokens()
		. nextTokens()
		. hasMoreTokens() 따라서 더 토큰이 있는가를 체크함
		
		
 */
public class StringTokenizer1 {

	public static void main(String[] args) {

		String query1 = "홍길동/장화/홍련/콩쥐/팥쥐";
		String query2 = "name=korea&addr=seoul&age=21";
		
		// String 
		StringTokenizer st1 = new StringTokenizer(query1, "/");
		StringTokenizer st2 = new StringTokenizer(query2, "&");
		
		int n1 = st1.countTokens();
		int n2 = st2.countTokens();
		
		System.out.println("n1의 토큰 수: " + n1 + ", n2의 토큰 수: " + n2);
		System.out.println();
		
		for(int i = 0; i < n1; i++) {
			String token1 = st1.nextToken();
			System.out.print(token1 + " ");
		}
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		System.out.println();
		
		for(int i = 0; i < n2; i++) {
			String token2 = st2.nextToken();
			System.out.print(token2 + " ");
		}
	}

}
