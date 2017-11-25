package 查找字符串最后一次出现的位置;

import java.security.acl.LastOwnerException;

public class SearchLastString {
	// 通过字符串函数 strOrig.lastIndexOf(Stringname)
	// 来查找子字符串 Stringname 在 strOrig 出现的位置
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOrig = "hello world , hello  Runoob";
		int lastIndex = strOrig.lastIndexOf("Runoob");
		if (lastIndex == -1) {
			System.out.println("未找到字符串Runoob");

		} else {
			System.out.println("字符串最后出现的位置是:" + lastIndex);

		}

	}

}
