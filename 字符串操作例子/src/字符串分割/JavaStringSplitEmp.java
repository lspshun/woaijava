package �ַ����ָ�;

//ʹ���� split(string) ����ͨ��ָ���ָ������ַ����ָ�Ϊ����
public class JavaStringSplitEmp {
	public static void main(String args[]) {

		String str = "www-runoob-com";
		String[] temp;
		String delimeter = "-"; // ָ���ָ��ַ�
		temp = str.split(delimeter); // �ָ��ַ���
		// ��ͨ for ѭ��
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
			System.out.println("");
		}

		System.out.println("------java for eachѭ������ķ���-----");
		String str1 = "www.runoob.com";
		String[] temp1;
		String delimeter1 = "\\."; // ָ���ָ��ַ��� . ����Ҫת��
		temp1 = str1.split(delimeter1); // �ָ��ַ���
		for (String x : temp1) {
			System.out.println(x);
			System.out.println("");
		}

	}

}