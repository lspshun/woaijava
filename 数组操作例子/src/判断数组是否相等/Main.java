package 判断数组是否相等;

//使用 equals ()方法来判断数组是否相等
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		int[] ary = { 1, 2, 3, 4, 5, 6 };
		int[] ary1 = { 1, 2, 3, 4, 5, 6 };
		int[] ary2 = { 1, 2, 3, 4 };
		System.out.println("数组 ary 是否与数组 ary1相等? ：" + Arrays.equals(ary, ary1));
		System.out.println("数组 ary 是否与数组 ary2相等? ：" + Arrays.equals(ary, ary2));
	}
}
