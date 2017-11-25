package 数组排序及查找;

//使用 sort () 和 binarySearch () 方法来对数组进行排序及查找数组中的元素，
//我们定义了 printArray() 输出结果
import java.util.Arrays;

public class MainClass {
	public static void main(String args[]) throws Exception {
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(array);
		printArray("Sorted array", array);
		int index = Arrays.binarySearch(array, 2);
		System.out.println("Found 2 @ " + index);
	}

	private static void printArray(String message, int array[]) {
		System.out.println(message + ": [length: " + array.length + "]");
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
