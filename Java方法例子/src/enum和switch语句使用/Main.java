package enum��switch���ʹ��;

//Java ����ö������Ҫʹ�� enum �ؼ��֣������������������Ͷ��� java.lang.Enum �������
enum Car {
    lamborghini,tata,audi,fiat,honda
}
public class Main {
    public static void main(String args[]){
        Car c;
        c = Car.tata;
        switch(c) {
            case lamborghini:
                System.out.println("��ѡ���� lamborghini!");
                break;
            case tata:
                System.out.println("��ѡ���� tata!");
                break;
            case audi:
                System.out.println("��ѡ���� audi!");
                break;
            case fiat:
                System.out.println("��ѡ���� fiat!");
                break;
            case honda:
                System.out.println("��ѡ���� honda!");
                break;
            default:
                System.out.println("�Ҳ�֪����ĳ��͡�");
                break;
        }
    }
}
