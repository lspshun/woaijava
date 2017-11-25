package 继承;

// 继承父类的特征行为,使子类对象具有父类的实例域和方法
// java 通过extends关键字申明一个类从另外一个类继承过来的
public class Penguin {
	private String name;
	private int id;

	public Penguin(String myName, int myId) {
		name = myName;
		id = myId;
	}

	public void eat() {
		System.out.println(name + "吃饭");
	}

	public void sleep() {
		System.out.println(name + "睡觉");

	}

	public void introduction() {
		System.out.println("大家好!我是" + id + name + ",");
	}
}
