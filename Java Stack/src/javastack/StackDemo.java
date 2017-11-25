package javastack;

import java.util.EmptyStackException;
import java.util.Stack;

// 栈是vector(向量)的一个子类,实现了一个标准的后进先出的栈
//堆栈只定义了默认构造函数,用来创造一个空栈
// Boolean empty()判断是否为空
// Object peek()查看堆栈顶部的对象,但不从堆栈中移除他
// Object pop()移除堆栈顶部的对象,并作为次函数的值返回该对象
// Object push(Object element)把项压入堆栈顶部
// int searchObject(Object element)返回对象在堆栈中的位置,以1为基数
public class StackDemo {
	static void showpush(Stack<Integer> st, int a) {
		st.push(new Integer(a));
		System.out.println("push(" + a + ")");
		System.out.println("stack: " + st);
	}

	static void showpop(Stack<Integer> st) {
		System.out.print("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("stack: " + st);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		System.out.println("stack: " + st);
		showpush(st, 42);
		showpush(st, 66);
		showpush(st, 99);
		showpop(st);
		showpop(st);
		showpop(st);
		try {
			showpop(st);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
	}
}
