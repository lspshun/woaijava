package �׳�;
//һ���������Ľ׳ˣ�Ӣ�factorial��������С�ڼ����ڸ������������Ļ���������0�Ľ׳�Ϊ1����Ȼ��n�Ľ׳�д��n!��

//
//�༴n!=1��2��3��...��n���׳�����Եݹ鷽ʽ���壺0!=1��n!=(n-1)!��n��

public class MainClass {
	public static void main(String args[]) {
		for (int counter = 0; counter <= 10; counter++) {
			System.out.printf("%d! = %d\n", counter, factorial(counter));
		}
	}

	public static long factorial(long number) {
		if (number <= 1)
			return 1;
		else
			return number * factorial(number - 1);
	}
}
