package generic;

// 일반 class 생성 하여 기본 타입으로 만들기
//class Point {
//	int x;
//	int y;
//	
//	Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	int getX() {
//		return x;
//	}
//	int getY() {
//		return y;
//	}
//}


// 일반 class 생성하여 wrapper 타입으로 변수 사용
//class Point {
//	Integer x;
//	Double y;
//	
//	Point(Integer x, Double y) {
//		this.x = x;
//		this.y = y;
//	}
//	Integer getX() {
//		return x;
//	}
//	Double getY() {
//		return y;
//	}
//}

// generic으로 구현하기
class Point <T,V> {
	T x;
	V y;
	
	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	T getX() {
		return x;
	}
	V getY() {
		return y;
	}
}

public class Generic7 {
//  ↓이런 타입을 가짐
//	<>    반환타입  메소드명(인자:객체)
//	<T,V> double makeRect(Point<T,V> p1, Point<T,V> p2) {
	
	// main 메소드와 함께 사용하기 위해 public static이 붙음!
	public static <T,V> double makeRect(Point<T,V> p1, Point<T,V> p2) {
		
		// (Number)란 ; nemeric type으로 일반화 시켜주는 것 
		// doubleValue() - 값을 double 값으로 
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
		
	}
	
	public static void main(String[] args) {
		
		Point <Integer, Double> p1 = new Point(0, 0.0);
		Point <Integer, Double> p2 = new Point(10, 10.2);
		
		System.out.println("면적: " + makeRect(p1, p2));

	}

}
