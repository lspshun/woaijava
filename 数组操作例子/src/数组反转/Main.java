package ���鷴ת;

// Collections.reverse(ArrayList) ��������з�ת
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		System.out.println("��תǰ����: " + arrayList);
		Collections.reverse(arrayList);
		System.out.println("��ת������: " + arrayList);
	}
}
