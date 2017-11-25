package 方法;
//实现一个方法，接收一个层数值n，打印一个有n层的直角三角形，并返回底边最后一个值。并打印出来
public class PrintTriangle {
    public static void main(String[] args) {

        // 创建对象，对象名为a
        PrintTriangle a = new PrintTriangle();

        int lastNum;    //用来存储最后一个值

        // 调用方法，传入层数
        lastNum = a.printRightTriangle(5);
        //打印最后一个数
        System.out.println("最后一个值为"+lastNum);
    }

    /*
     * 功能：打印出直角三角形
     */
    public int printRightTriangle(int n){
            int last = 0;
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= i; j++) {
                    last++;
                    System.out.printf("%02d ", last);
                }
                System.out.println();
            }
            return last;
    }
}
