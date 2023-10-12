package access;

import inheritance.Inheritance;

// 접근제어자
/*
 * 자바에서는 API를 사용할 때 제어자에 따라서 접근 허용여부가 달라진다.
 * 접근제어자는 크기순서대로 
 * public > protected > default > private
 * 
 * 위 접근제어자는 클래스 선언, 생성자 선언, 메소드 선언, 필드 선언할 때 사용한다.
 * 
 * 이 중 클래스는 public, default(생략)만 사용할 수 있다.
 * 
 * public: 접근 범위가 가장 큰 제어자
 * 			다른 패키지에서도 접근이 가능하다.
 * 
 * protected: 상속받은 자식 클래스만 다른 클래스에서 접근 가능
 * 				기본적으로 같은 패키지 내에서는 접근 가능하다.
 * 
 * default(생략): 제어자를 선언하지 않을 때 자동으로 선언된다.
 * 					같은 패키지 내에서만 접근 가능하다.
 * 
 * private: 자신의 클래스에서만 접근 가능
 * 			다른 클래스에서 접근 불가능
 */
class Apple {

}

public class AcessModifier {// 클래스에 접근할 때
	// 필드에 접근할 때
	// 생성자에 접근할 때
	// 메소드에 접근할 때
	public static void main(String[] args) {
		// 다른 패키지에 있는 클래스를 호출한다.
		Inheritance i = new Inheritance();
		i.print1();
	}

}
