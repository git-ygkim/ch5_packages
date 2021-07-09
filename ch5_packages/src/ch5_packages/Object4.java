package ch5_packages;

class Point2 {
	int x, y;
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	// 새로 만든 equals 메소드
	// 객체 속의 값을 비교하기 위해 만든 메소드 
	public boolean equals(Point2 p) {
		if(x == p.x && y == p.y) {
			return true;
		} else {
			return false;
		}
	}
}


public class Object4 {

	public static void main(String[] args) {

		Point2 a = new Point2(2,3);
		Point2 b = new Point2(2,3);
		Point2 c = new Point2(3,4);
		
		if(a==b) {	// 객체 끼리의 비교는 주소값 비교이다. 
			System.out.println("a==b");
		}
		if(a.equals(b)) {
			System.out.println("A와 B는 같습니다.");
		}  
			
		if(a.equals(c)) {
			System.out.println("a와 c는 같습니다.");
		}
	}

}
