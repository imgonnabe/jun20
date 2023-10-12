package abstractor;

// 추상화 -> 인터페이스
/*
 * 추상클래스: 인터페이스의 역할을 하면서 클래스같은 돌연변이같은 클래스
 * 
 * 추상: 대략적으로 만들었기 때문에 내부 구성을 완벽히 만들어야 객체 생성 가능
 * 정물: 객체를 생성할 수 있는 클래스
 * ---------------------------------------------------------------------
 * 자바에서 추상화라는 개념이 있다.
 * 일단 추상이라는 의미는 현실화 되어질 필요가 없는, 인스턴스화할 필요가 없는 성질의 클래스이다.
 * 
 * 자바에서는 객체지향을 통해 프로그램이 실행되는데
 * 이 추상이라는 개념을 클래스에 적용하면 자신의 인스턴스를 발생할 수 없는 형태로 만들어지게 된다.
 * 
 * 이렇게 인스턴스화 될 필요가 없지만 상속 개념에서 중요한 위치를 갖게 될 때 보통 추상클래스로 선언하여 사용한다.
 * 
 * 추상클래스 선언규칙
 * 1. 클래스에 정의된 메소드 중 추상 메소드가 하나라도 있다면 추상클래스가 되어야 한다.
 * 
 * 2. 추상 메소드는 메소드 바디가 없는 형태
 * 	  리턴타입 앞에 abstract라고 붙인다.
 * 	  메소드 괄호 뒤에 ;를 붙여 명령문 끝을 나타낸다.
 * 		abstract void print();
 * 
 * 3. 추상 클래스는 자신의 인스턴스를 만들 수 없다.
 * 	  추상 메소드가 있다면, 클래스 앞에 abstract라고 붙여준다.
 * 	  생성자, 메소드, 필드 모두 선언 가능하다. 상속도 가능하다.
 * 
 * 4. 추상 메소드가 하나도 없지만 클래스를 추상화하고 싶다면 abstract 키워드를 클래스 앞에 붙여주면 추상 클래스가 된다.
 */

abstract class Hero{// 추상 클래스
	public String name;
	public abstract void attack();// 추상 메소드
}

class Ironman extends Hero{
	@Override
	public void attack() {// 미완성 메소드를 완성해서 사용한다.
		System.out.println("부모에서 미완이라면 자식에서 만든다.");
	}
	
}

class Hulk extends Hero{
	@Override
	public void attack() {// 강제 구현
		System.out.println("강제적으로 만들기");
	}
	
}

class SpiderMan extends Hero{
	@Override
	public void attack() {
		System.out.println("이렇게 추상 클래스가 있으면 나머지 강제로 진행");
	}
	
}

public class Abstractor {
	public static void main(String[] args) {
		
		
	}

}
