package static01;

// static
/*
 * static은 정적이라는 의미가 있다.
 * 자바에서 정적 개념과 동적 개념이 있다.
 * 쉽게 표현하면 정적은 클래스가 로드되는 시점이다.
 * 동적은 로드된 클래스가 실행된 이후를 말한다.
 * 
 * 이 중 객체는 동적 데이터라고 해서 프로그램이 실행된 이후에 발생되는 대표적인 형태이다.
 * 
 * 클래스를 정의할 때 static 키워드를 사용한 property와 메소드는 해당 클래스의 인스턴스를 생성하지 않아도 접근할 수 있다.
 * 이러한 property와 메소드를 정적 멤버라고 한다.
 */
class Apple {
	static final double PI = 3.14159265359;// 상수 (final은 초기화 필수)
	static int COUNT = 1;
	
	void print() {
		for (int i = 0; i < 10; i++) {// i는 스택영역에서 만들어짐
			System.out.println(i);
		}
	}
}

public class Static01 {
	public static void main(String[] args) {
		Apple.COUNT = 10;
		System.out.println(Apple.COUNT);

	}

}
