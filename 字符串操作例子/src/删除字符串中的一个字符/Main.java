package 删除字符串中的一个字符;

import javax.print.attribute.standard.RequestingUserName;

// 通过字符串函数substring()函数删除字符串中的一个字符
//将功能封装在removeCharAt函数中
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is java";
		System.out.println(removeCharAt(str, 3));

	}

	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);

	}
}
