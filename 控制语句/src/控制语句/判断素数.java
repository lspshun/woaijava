package 控制语句;

public class 判断素数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4549;
		boolean result = true;
		for (int i = 2; i * i <= a; i++) {
			if (a % i == 0) {
				result = false;

				break;
			}

		}
		if (result) {
			System.out.println(a + "是素数");

		}

		System.out.println(a + "不是素数");
	}
}
