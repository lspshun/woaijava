package 方法;

class Animal {
	void eat() {
		System.out.println("animal : eat");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog : eat");
	}

	void eattext() {
		this.eat(); // 调用自己的
		super.eat(); // 调用父类的方法
	}
}

public class SuperThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.eat();
		Dog b = new Dog();
		b.eattext();

	}

}
