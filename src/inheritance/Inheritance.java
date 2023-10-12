package inheritance;

// 패키지(p.286): 관련성 있는 자바 파일들을 폴더 단위로 구분
//					com.poseidon.print
//					net.daum.map
// import(p.290): 상위패키지.하위패키지.클래스명;
//					import java.util.ArrayList;
//					import java.util.HashSet;
//					import java.util.*;

class Apple {
	private int number;
	private String name;

	private Apple() {

	}

	static Apple getInstance() {
		return new Apple();
	}

	public void setNumber(int number) {// setting > DTO
		if (number > 100) {
			number = 50;
		}
		this.number = number;
	}

	public int getNumber() {// getter
		return this.number;
	}


	public void setName(String name) {
		if (name.equals("바보") || name.equals(null)) {
			name = "춘식이";
		}
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

public class Inheritance {
	int number;
	public int num1;

	public void print1() {

	}

	void print2() {

	}

	public static void main(String[] args) {
		// Apple a = new Apple();
		Apple a = Apple.getInstance();
		// a.number = 150;
		a.setNumber(150);// private number에 접근하지 못해서 메소드 활용
		System.out.println(a.getNumber());// private number에 우회 접근
		a.setName(null);
		System.out.println(a.getName());
		
	}

}
