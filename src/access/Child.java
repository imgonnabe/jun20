package access;

import inheritance.Parent;

public class Child extends Parent{
	// 상속으로 연결
	// 부모의 코드를 자식이 자신의 것처럼 활용
	void print() {
		System.out.println(number2);
	}

}
