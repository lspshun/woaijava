package ����;

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
		this.eat(); // �����Լ���
		super.eat(); // ���ø���ķ���
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
