package ���齻��;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList objArray = new ArrayList();
		ArrayList objArray2 = new ArrayList();
		objArray2.add(0, "common1");
		objArray2.add(1, "common2");
		objArray2.add(2, "notcommon");
		objArray2.add(3, "notcommon1");
		objArray.add(0, "common1");
		objArray.add(1, "common2");
		objArray.add(2, "notcommon2");
		System.out.println("array1 ����Ԫ�أ�" + objArray);
		System.out.println("array2 ����Ԫ�أ�" + objArray2);
		objArray.retainAll(objArray2);
		System.out.println("array2 & array1 ���齻��Ϊ��" + objArray);
	}
}
