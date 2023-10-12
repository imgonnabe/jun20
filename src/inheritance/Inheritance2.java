package inheritance;

import java.util.*;

/*
 * 오버라이드: 상속, 메소드 재정의
 * 				부모의 메소드를 자식 클래스에서 재정의해서 사용하는 것
 * 				부모의 일부 메소드를 다시 수정화해서 사용하기
 *  규칙: 1. 부모의 메소드와 동일한 시그니처(리턴타입, 메소드명, 매개변수)를 가지고 있어야 한다. 다르면 다른 메소드
 * 		  2. 접근 제한을 더 강하게 할 수 없다. 동일하게 설정한다.
 * 		  3. 새로운 예외를 Throw할 수 없다.
 * 				오버라이드했다면 메소드 상단에 @override라고 표시된다.
 * 				자식 메소드에서 재정의했다면 부모의 메소드는 은닉된다.
 * 				은닉된 부모의 객체를 호출할 때는 super로 호출한다.
 * 
 * 오버로드: 매개변수, 같은 이름, 다른 호출
 * 			하나의 클래스 속에 같은 이름의 메소드를 여러개 만드는 것
 * 			메소드 시그니처(수, 순서, 타입)이 일치하지 않으면 된다.
 * 			호출할 때는 시그니처에 맞는 메소드가 일을 한다.
 * 			접근제어자, 리턴타입은 보지 않는다. 오직 파라미터만.
 * 
 * 상속
 * 1. 기존에 작성된 클래스를 재활용할 수 있다.
 * 2. 자식 클래스 설계 시 중복되는 멤버를 미리 부모 클래스에 작성해 놓으면 자식 클래스에서는 해당 멤버를
 * 		작성하지 않아도 된다.
 * 3. 클래스 간의 계층적 관계를 구성함으로써 다형성의 문법적 토대를 마련한다.
 * 
 * class 자식클래스이름 extend 부모클래스이름 { }
 * ----------------------------------------------------------
 * 자바의 모든 클래스는 Object의 하위 클래스이다.
 */
class Animal {// 부모 클래스, 상위 타입, 슈퍼 타입
	String name;
	int age;

	public void sound() {
		System.out.println("자식마다 소리가 달라요.");
	}
}

// 자바는 단일상속한다.
class Dog extends Animal {// 자식 클래스, 하위 클래스, 서브 타입
	int number;
	@Override
	public void sound() {
		System.out.println("Bow~");
	}

}
// 부모에 정의된 메소드를 재정의한다.
class Cat extends Animal {
	//어노테이션 > 정보표시
	@Override
	public void sound() {
		System.out.println("Mew~");
	}
}

public class Inheritance2 {
	public static void main(String[] args) {
		Animal[] oArr = new Animal[3];
		oArr[0] = new Dog();
		oArr[1] = new Cat();
		oArr[2] = new Human();
		
		for (int i = 0; i < oArr.length; i++) {
			oArr[i].sound();
		}
		
		Animal aaa = new Dog();
		Animal aaa4 = new Korean();
		aaa4.sound();
		// aaa4.ssn = "";// 없는 것처럼 보인다.
		Korean kor = (Korean) aaa4;
		kor.ssn = "홍길동";
		kor.myInfo();
		((Korean)aaa4).myInfo();	
		System.out.println("-----------------");
		
		List<Integer> l = new ArrayList<>();
		Set<Integer> s = new HashSet<>();
		Map<Integer, Integer> m = new HashMap<>();
		
		System.out.println("-----------------");
		Dog dog = new Dog();
		Animal a = new Animal();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();

		Animal a2 = new Cat();
		Object obj = new String();
		
		MZ mz = new MZ();
		mz.ssn = "951226-2000000";
		mz.myInfo();

	}

}

class Human extends Animal {

}

class Asian extends Human {
	String rice;

}

class Korean extends Asian {
	String ssn;
	
	void myInfo() {
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "살 입니다.");
		System.out.println("주민번호는 " + ssn + "입니다.");
	}
	@Override
	public void sound() {
		System.out.println("부모님이 한국분이십니다.");
	}

}

class MZ extends Korean {
	@Override
	void myInfo() {
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "살 입니다.");
		System.out.println("주민번호는 " + ssn.substring(0, 8) + "******입니다.");
	}
}

class KorShort extends Cat{
	@Override
	public void sound() {
		System.out.println("냐옹");
	}
	
}
