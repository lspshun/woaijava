package �ַ������ܱȽϲ���;

//ͨ�����ַ�ʽ�����ַ�����������������
public class StringComparePerformance {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			String s1 = "hello";
			String s2 = "hello";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("ͨ�� String �ؼ��ʴ����ַ���" + " : " + (endTime - startTime) + " ����");
		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			String s3 = new String("hello");
			String s4 = new String("hello");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("ͨ�� String ���󴴽��ַ���" + " : " + (endTime1 - startTime1) + " ����");
	}
}
