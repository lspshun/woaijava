package Varargs�ɱ����;

//Java1.5�ṩ��һ����varargs���¹��ܣ����ǿɱ䳤�ȵĲ�����
//"Varargs"��"variable number of arguments"����˼����ʱ��Ҳ���򵥵ĳ�Ϊ"variable arguments"
//����ʵ�θ����ɱ�ķ�����ֻҪ��һ���βε�"����"��"������"֮���������������"."����"..."��Ӣ����ľ���ʡ�Ժţ����Ϳ��������Ͳ�ȷ����ʵ����ƥ�䡣 
public class Main {
	static int sumvarargs(int... intArrays) {
		int sum, i;
		sum = 0;
		for (i = 0; i < intArrays.length; i++) {
			sum += intArrays[i];
		}
		return (sum);
	}

	public static void main(String args[]) {
		int sum = 0;
		sum = sumvarargs(new int[] { 10, 12, 33 });
		System.out.println("�������֮��Ϊ: " + sum);
	}
}
