package 控制语句;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 1, i2 = 1;
		int sum1 = 0, sum2 = 0;
		while (i1 <= 1000) {
			if (0 == i1 % 2) {
				sum1 += i1;

			}
			i1++;
		}
		System.out.println("求偶数的和"+sum1);
		do {

			if (0 == i2 % 2) {
				sum2 += i2;
			}
			i2++;
		} while (i2 <= 1000);
		System.out.println("do while 求1000内偶数的和"+sum2);

	}
}