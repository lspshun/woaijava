package �ַ�������;

//ʹ���� String ��� indexOf() �������ַ����в������ַ������ֵ�λ�ã�
//������ڷ����ַ������ֵ�λ�ã���һλΪ0������������ڷ��� -1��
public class SearchStringEmp {
	public static void main(String[] args) {
		String strOrig = "Google Runoob Taobao";
		int intIndex = strOrig.indexOf("Runoob");
		if (intIndex == -1) {
			System.out.println("û���ҵ��ַ��� Runoob");
		} else {
			System.out.println("Runoob �ַ���λ�� " + intIndex);
		}
	}
}
