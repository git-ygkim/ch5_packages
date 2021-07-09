package ch5_packages;

/*
 * Object클래스 java.lang
		equals(객체)
		getClass()
		hashCode()
		toString()
		notify()	// thread 제어할 때 사용
		notifyAll()	// thread 제어할 때 사용
		wait()		// thread 제어할 때 사용

 */

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")"; 
	}
}

public class Object1 {
	public static void main(String[] args) {
		Point a = new Point(2, 3);
		
		System.out.println(a.toString());
		System.out.println(a);	// 객체를 출력할 때는 toString이 붙게 되어 있음. 
	}
	
	

}
