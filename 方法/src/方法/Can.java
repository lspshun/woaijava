package 方法;

public class Can {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Can a = new Can();
		// 建对象，对象名为a
		double rAvg;
		// 用来存放返回的平均成绩
		int sub1 = 9;
		int sub2 = 99;
		// 调用方法，传入两门课程的成绩
		rAvg = a.calcAve(sub1, sub2);
		System.out.println("平均分" + rAvg);

	}

	/*
	 * 功能：计算两门课程考试成绩的平均分并输出平均分 定义一个包含两个参数的方法， 用来传入两门课程的成绩 两个参数 a 和 b 为我们的形参，只在方法内有效
	 */
	// 方法调用时，系统会专门为方法开辟一块空间用来存放方法内的变量。
	// 此时大家可以看到，sub1和sub2两个实参其实并没有进入方法中，
	// 只是将它们两个的值赋值给了形参a和b。
	private double calcAve(int a, int b) {
		// TODO Auto-generated method stub
		double Ave = (a + b) / 2;
		return Ave;
	}

}
