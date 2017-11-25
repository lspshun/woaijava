package javastack;

import java.util.EmptyStackException;
import java.util.Stack;

// ջ��vector(����)��һ������,ʵ����һ����׼�ĺ���ȳ���ջ
//��ջֻ������Ĭ�Ϲ��캯��,��������һ����ջ
// Boolean empty()�ж��Ƿ�Ϊ��
// Object peek()�鿴��ջ�����Ķ���,�����Ӷ�ջ���Ƴ���
// Object pop()�Ƴ���ջ�����Ķ���,����Ϊ�κ�����ֵ���ظö���
// Object push(Object element)����ѹ���ջ����
// int searchObject(Object element)���ض����ڶ�ջ�е�λ��,��1Ϊ����
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
