package 方法;

public class PrintScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建对象,对象名为a
		PrintScore a = new PrintScore();
		int rSum;  
        //设置一个int变量,接受方法的返回值
		// 调用方法,传入两门课的成绩
		rSum = a.calcSum(78,99);
		System.out.println("总分:"+rSum);
		

	}
	/*
     * 功能：计算两门课程考试成绩的总分并输出总分
     * 定义一个包含两个参数的方法，用来传入两门课程的成绩
     */
	private int calcSum(int a, int b) {
		// TODO Auto-generated method stub
		int sum = a + b;
		return sum;
	}

}
