package for��foreachѭ��ʹ��;

//or ���Ƚϼ򵥣�����ѭ�����ݡ�
//
//forѭ��ִ�еĴ�������ִ��ǰ��ȷ���ġ��﷨��ʽ���£�
//
//for(��ʼ��; �������ʽ; ����) {
//    //�������
//}
//
//foreach�����java5��������֮һ���ڱ������顢���Ϸ��棬foreachΪ������Ա�ṩ�˼���ķ��㡣
//
//foreach �﷨��ʽ���£�
//
//for(Ԫ������t Ԫ�ر���x : ��������obj){ 
//     ������x��java���; 
//} 
public class Main {
    public static void main(String[] args) {
        int[] intary = { 1,2,3,4};
        forDisplay(intary);
        foreachDisplay(intary);
    }
    public static void forDisplay(int[] a){  
        System.out.println("ʹ�� for ѭ������");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void foreachDisplay(int[] data){
        System.out.println("ʹ�� foreach ѭ������");
        for (int a  : data) {
            System.out.print(a+ " ");
        }
    }
}
