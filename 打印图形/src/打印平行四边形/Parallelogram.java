package ��ӡƽ���ı���;


public class Parallelogram {
    public static void main(String[] args) {
         //���ѭ�� ÿ�δ��һ��*
        for (int i = 1; i <=5; i++) {
            //���ո�
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            //�ڲ�ѭ�� ÿ�δ�ӡһ��*
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
