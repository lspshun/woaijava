package ����;

public class PrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num[][] = new int [10][10];
int count = 0;
for (int i = 0; i < 10; i++) {
	for (int j = 0; j < 10; j++) {
		num[i][j] = ++count;
		System.out.print(num[i][j]);
		
	}
	System.out.println();
}
	}

}
