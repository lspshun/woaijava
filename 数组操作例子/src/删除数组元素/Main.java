package ɾ������Ԫ��;

//ʹ�� remove () ������ɾ������Ԫ��
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> objArray = new ArrayList<String>();
		objArray.clear();
		objArray.add(0, "�� 0 ��Ԫ��");
		objArray.add(1, "�� 1 ��Ԫ��");
		objArray.add(2, "�� 2 ��Ԫ��");
		System.out.println("����ɾ��Ԫ��ǰ��" + objArray);
		objArray.remove(1);
		objArray.remove("0th element");
		System.out.println("����ɾ��Ԫ�غ�" + objArray);
	}
}
