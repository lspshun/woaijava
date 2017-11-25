package 数组反转;

// Collections.reverse(ArrayList) 将数组进行反转
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		System.out.println("反转前排序: " + arrayList);
		Collections.reverse(arrayList);
		System.out.println("反转后排序: " + arrayList);
	}
}
