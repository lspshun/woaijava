package ����ϲ�;

//ͨ�� List ��� Arrays.toString () ������ List ��� list.Addall(array1.asList(array2) ��������������ϲ�Ϊһ������
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		String a[] = { "A", "E", "I" };
		String b[] = { "O", "U" };
		List list = new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));
	}
}
