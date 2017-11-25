package java封装;

//public方法是外部类访问该类成员变量的入口。
//通常情况下，这些方法被称为getter和setter方法。
//因此，任何要访问类中私有成员变量的类都要通过这些getter和setter方法
public class EncapTest {
	private String name;
	private String idNum;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

