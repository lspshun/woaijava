package 쳲���������;
//쳲���������ָ��������һ������ 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233��377��610��987��1597��2584��4181��6765��10946��17711��28657��46368����

//�ر�ָ������0����0����1���ǵ�һ��1��
//
//������дӵ����ʼ��ÿһ�����ǰ����֮�͡�

public class MainClass {
	public static long fibonacci(long number) {
		if ((number == 0) || (number == 1))
			return number;
		else
			return fibonacci(number - 1) + fibonacci(number - 2);
	}

	public static void main(String[] args) {
		for (int counter = 0; counter <= 10; counter++) {
			System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
		}
	}
}
