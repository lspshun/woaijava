package �ж������Ƿ����;

//ʹ�� equals ()�������ж������Ƿ����
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		int[] ary = { 1, 2, 3, 4, 5, 6 };
		int[] ary1 = { 1, 2, 3, 4, 5, 6 };
		int[] ary2 = { 1, 2, 3, 4 };
		System.out.println("���� ary �Ƿ������� ary1���? ��" + Arrays.equals(ary, ary1));
		System.out.println("���� ary �Ƿ������� ary2���? ��" + Arrays.equals(ary, ary2));
	}
}
