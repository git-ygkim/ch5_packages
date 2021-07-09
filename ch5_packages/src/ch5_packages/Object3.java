package ch5_packages;

public class Object3 {

	public static void main(String[] args) {
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = a;

		if(a.equals(b)) {	// 주소 값이 같으냐 아니다. 다름. 값은 같아도 주소값이 다름. 다른 객체이기 때문에
			System.out.println("a==b");
		}  
			
		if(a.equals(c)) {
			System.out.println("a==c");
		}
	}

}
