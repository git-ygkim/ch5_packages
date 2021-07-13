package ch5_packages;


/*
	Math - 이 클래스의 가장 큰 특징은 static 클래스 이다. 
		. 모든 멤버는 static 이다.
		. new 선언 하지 않고 사용 가능하다. 객체선언을 하지 않아도 됨
		. abs() - 절대값
		. ceil() - 올림 : 입력된 값보다 크거나 같은 가장 작은 정수값을 double 형으로 반환
		. floor() - 내림(절삭) : ceil과 반대로 입력된 값 인자 보다 작거나 같은 정수값을 double 형으로 반환
		. max(a,b) - a,b 중에 무엇이 클까~
		. min(a,b) - a,b 중에 무엇이 작을까
		. round() - 반올림	
		. random() - 랜덤 0~1사이 실수값
 */
public class Math1 {

	public static void main(String[] args) {
		
		double r1 = Math.random();
		System.out.println(r1);
		System.out.println(r1*10);
		System.out.println(r1*100);
		System.out.println(r1*1000);
		System.out.println(r1*10000);
		
		System.out.println(Math.ceil(r1*10000));	// 올림
		System.out.println(Math.floor(r1*10000));	// 내림
		
		for(int i = 0; i < 30; i++) {
			// 1부터 7 사이 값을 랜덤하게 뽑고 싶을 때
			double d3 = Math.floor( Math.random() * 7 ) + 1 ;
			int d4 = (int) d3;
			System.out.print(d4 + " ");
		}
		
		System.out.println("\n이번주 행운의 로또 번호는 . . . .");
		for(int i = 0; i < 6; i++) {
//			double lotto = Math.floor(Math.random() * 45) + 1;
			int lotto = (int) ( Math.floor(Math.random() * 45) + 1 );
			System.out.print(lotto + " ");
			
		}
		
		

	}

}
