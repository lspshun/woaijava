package ��ŵ���㷨;
//��ŵ�����ֳƺ�������������Դ��ӡ��һ�����ϴ�˵��������ߡ������촴�������ʱ�������������ʯ���ӣ���һ�������ϴ������ϰ��մ�С˳������64Ƭ�ƽ�Բ�̡����������������Ű�Բ�̴����濪ʼ����С˳�����°ڷ�����һ�������ϡ����ҹ涨����СԲ���ϲ��ܷŴ�Բ�̣�����������֮��һ��ֻ���ƶ�һ��Բ�̡�

//
//�����������˵���ݱ�Ϊ��ŵ����Ϸ���淨����:
//
//   1.����������A,B,C��A���������ɵ���
//   2.ÿ���ƶ�һ�����,С��ֻ�ܵ��ڴ������
//   3.�����е��Ӵ�A��ȫ���Ƶ�C����

public class MainClass {
	public static void main(String[] args) {
		int nDisks = 3;
		doTowers(nDisks, 'A', 'B', 'C');
	}

	public static void doTowers(int topN, char from, char inter, char to) {
		if (topN == 1) {
			System.out.println("Disk 1 from " + from + " to " + to);
		} else {
			doTowers(topN - 1, from, to, inter);
			System.out.println("Disk " + topN + " from " + from + " to " + to);
			doTowers(topN - 1, inter, from, to);
		}
	}
}
