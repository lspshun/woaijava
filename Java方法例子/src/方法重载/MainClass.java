package ��������;

/**
 * @author li 
 * ���أ�Overloading���Ķ��壺��������������ķ�������ͬ, ��������һ�£�
 * ��ô����˵һ����������һ�����������ء�
 * ����˵�����£� ��������ͬ �����Ĳ������ͣ� 
 * ����˳��������һ�ͬ �����ķ������Ϳ��Բ���ͬ ���������η����Բ���ͬ
 * main����Ҳ���Ա�����
 */
class MyClass {
	int height;

	MyClass() {
		System.out.println("�޲������캯��");
		height = 4;
	}

	MyClass(int i) {
		System.out.println("���Ӹ߶�Ϊ " + i + " ��");
		height = i;
	}

	void info() {
		System.out.println("���Ӹ߶�Ϊ " + height + " ��");
	}

	void info(String s) {
		System.out.println(s + ": ���Ӹ߶�Ϊ " + height + " ��");
	}
}

public class MainClass {
	public static void main(String[] args) {
		MyClass t = new MyClass(3);
		t.info();
		t.info("���ط���");
		// ���ع��캯��
		new MyClass();
	}
}
