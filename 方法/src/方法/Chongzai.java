package ����;

//��Java��ͨ��������д������������෽���ķ�������ͬ��
//�����Ĳ����б�ͬ�������ĸ����Ͳ������͵Ĳ�ͬ����ʵ�ַ��������ء�
//��ν�������ؾ��ǣ�
//��һ�����У���һϵ�еķ������з�������ͬ���������б�ͬ�����෽����ʵ�־��Ƿ������ء�
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
