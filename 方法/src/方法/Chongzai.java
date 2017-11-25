package 方法;

//在Java中通过在类中写多个方法，这类方法的方法名相同，
//方法的参数列表不同（参数的个数和参数类型的不同）来实现方法的重载。
//所谓方法重载就是：
//在一个类中，有一系列的方法具有方法名相同，但参数列表不同，这类方法的实现就是方法重载。
public class Chongzai {
	void f(int i) {
		System.out.println("i=" + i);
	}

	void f(float f) {
		System.out.println("f=" + f);
	}

	void f(String s) {
		System.out.println("s=" + s);
	}

	void f(String s1, String s2) {
		System.out.println("s1+s2=" + (s1 + s2));
	}

	void f(String s, int i) {
		System.out.println("s=" + s + ",i=" + i);
	}

	public static void main(String[] args) {
		Chongzai chongzai = new Chongzai();
		chongzai.f(3456);
		chongzai.f(34.56f);
		chongzai.f("abc");
		chongzai.f("abc", "def");
		chongzai.f("abc", 3456);
	}

}
