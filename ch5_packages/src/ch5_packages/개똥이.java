package ch5_packages;

class A extends Object1{
	
}

class B extends A {
	
}

class C extends B {
	
}


public class 개똥이 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.toString());
		// 출력값 - 이것이 진짜 객체다. 없는데 주소값이 출력이 되므로
		//ch5_packages.A@24d46ca6

		B b = new B();
		System.out.println(b.toString());
		
		// 모든 클래스는 object로 형변환이 가능
		// 모든 클래스를 연결시키는 징검다리가 될 수 있음
		Object1 obj1 = new A();	// 업캐스팅
		Object1 obj2 = new B();	// 업캐스팅
		Object1 obj3 = new C();	// 업캐스팅
		
		// 업캐스팅
		Object1 [] arr = new Object1[3];
		arr[0] = new A();
		arr[1] = new B();
		arr[2] = new C();

		// 다운캐스팅
		A aa = (A) arr[0];
	}
}
