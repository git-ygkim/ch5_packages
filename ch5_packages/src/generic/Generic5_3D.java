package generic;

class Powder{
	void doPrinting() {
		System.out.println("파우더 재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 Powder입니다";
	}
}

class Plastic{
	void doPrinting() {
		System.out.println("플라스틱 재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 Plastic입니다";
	}
	
}

class GenericPrinter<T> {
	private T material;
	
	void setMaterial(T material) {
		this.material = material;
	}
	
	// override된 메소드 이므로 public 이여야 함
	@Override
	public String toString() {
		return material.toString();
	}
	
}

public class Generic5_3D {

	public static void main(String[] args) {
		
		// Powder
		GenericPrinter <Powder> po = new GenericPrinter();	//다이아몬드 생략
		po.setMaterial(new Powder());
		System.out.println(po); // 객체 출력
		
		
		
		// Plastic
		GenericPrinter <Plastic> pl = new GenericPrinter();
		pl.setMaterial(new Plastic());
		System.out.println(pl.toString());

	}

}
