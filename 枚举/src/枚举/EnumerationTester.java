package ö��;

// ö��(һ�λ�ö��)���󼯺��е�Ԫ��
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enumeration<String> days;
		Vector<String> dayNames = new Vector<String>();
		dayNames.add("sunday");
		dayNames.add("monday");
		dayNames.add("tuesday");
		dayNames.add("wednesday");
		dayNames.add("thursday");
		dayNames.add("friday");
		dayNames.add("saturday");
		days = dayNames.elements();
		while (days.hasMoreElements()) {
			System.out.println(days.nextElement());

		}

	}

}
