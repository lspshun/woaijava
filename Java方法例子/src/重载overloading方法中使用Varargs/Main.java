package ����overloading������ʹ��Varargs;
//���ط�����ʹ�ÿɱ����

public class Main {
	static void vaTest(int... no) {
		System.out.print("vaTest(int ...): " + "��������: " + no.length + " ����: ");
		for (int n : no)
			System.out.print(n + " ");
		System.out.println();
	}

	static void vaTest(boolean... bl) {
		System.out.print("vaTest(boolean ...) " + "��������: " + bl.length + " ����: ");
		for (boolean b : bl)
			System.out.print(b + " ");
		System.out.println();
	}

	static void vaTest(String msg, int... no) {
		System.out.print("vaTest(String, int ...): " + msg + "��������: " + no.length + " ����: ");
		for (int n : no)
			System.out.print(n + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		vaTest(1, 2, 3);
		vaTest("����: ", 10, 20);
		vaTest(true, false, false);
	}
}
