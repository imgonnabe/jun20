package abstractor;

abstract class Animal {
	public String kind;

	public void breathe() {

	}

	public abstract void sound();
}

class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

public class Abstractor2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----------------");

		Animal animal;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-----------------");
		
		animalSound(new Dog());
		animalSound(new Cat());
		// main 메서드에서는 static으로 선언되지 않은 animalSound 메서드를 참조하고 있으며,
		// 오류 메시지의 내용은 static으로 선언되지 않은 메서드나 필드를 참조할 수 없다는 오류 메시지다.
		// 참조할 수 없는 이유는 컴파일 순서에서 찾을 수 있다.
		// 다른 멤버보다 static 멤버가 먼저 컴파일되기 때문에,
		// static 멤버의 컴파일 시점에서는 static이 아닌 메서드나 필드는 정의되지 않았기 때문이다.
		// 따라서, 모든 메서드나 필드를 static 멤버로 바꾸거나
		// Abstractor2 클래스의 객체를 직접 생성해서 접근하는 방법으로 우회해야 한다.
		
	}

	public static void animalSound(Animal animal) {
		animal.sound();
		
	}

}
