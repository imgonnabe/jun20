package polymorphism;

import java.util.*;

// 다형성
/*
 * 다양한 형태로 변할 수 있는 것
 * 다형성은 동적 바인딩: 런타임 때 최종 타입이 결정되는 것
 * 다형성을 지원하려면 그 언어가 동적바인딩을 지원해야 한다.
 * 
 * 컴파일 타임 때 에러 판정이 난다.
 * 
 * 다형성의 한계: 상위 클래스에 만들어진 메소드에 한해 가능하다.
 */

class Hero {
	public String name;

	public void attack() {
		System.out.println("기본 공격");
	}
}

class Ironman extends Hero {
	public int suitCount;

	@Override
	public void attack() {
		System.out.println("레이저 공격");
	}

	public void makeSuit() {
		System.out.println("Javis! 수트 만들어.");
	}
}

class Hulk extends Hero {
	@Override
	public void attack() {
		System.out.println("주먹 공격");
	}
}

class SpiderMan extends Hero {
	@Override
	public void attack() {
		System.out.println("거미줄~");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Hero h1;// 컴파일
		h1 = new Ironman();// 런타임
		// 반드시 상위 타입이 앞에 와야 한다.

		h1.attack();
		Ironman ironman = (Ironman) h1;
		ironman.makeSuit();

		System.out.println(h1);// polymorphism.Ironman@5e91993f
		System.out.println(ironman);// polymorphism.Ironman@5e91993f

		Hulk hulk = new Hulk();
		SpiderMan man = new SpiderMan();

		Set<Hero> set = new HashSet<Hero>();
		set.add(ironman);
		set.add(hulk);
		set.add(man);
		for (Hero hero : set) {
			hero.attack();
		}

		List<Hero> l = new ArrayList<Hero>();
		l.add(ironman);
		l.add(hulk);
		l.add(man);
		for (Hero hero2 : l) {
			hero2.attack();
		}

	}

}
