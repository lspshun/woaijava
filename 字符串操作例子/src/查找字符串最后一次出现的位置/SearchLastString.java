package �����ַ������һ�γ��ֵ�λ��;

import java.security.acl.LastOwnerException;

public class SearchLastString {
	// ͨ���ַ������� strOrig.lastIndexOf(Stringname)
	// ���������ַ��� Stringname �� strOrig ���ֵ�λ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOrig = "hello world , hello  Runoob";
		int lastIndex = strOrig.lastIndexOf("Runoob");
		if (lastIndex == -1) {
			System.out.println("δ�ҵ��ַ���Runoob");

		} else {
			System.out.println("�ַ��������ֵ�λ����:" + lastIndex);

		}

	}

}
