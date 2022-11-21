import java.util.Scanner;

public class shuzu {//输入一组数，输出均值和大于均值的数
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.print("输入数组长度：");
        int x=in.nextInt();
        double sum=0;
        if (x>0){
            double[] kl=new double[x];//用new的方式创建一个元素属性为double，长度为x的数组（不浪费存储单元），并且new会将元素默认自动初始化为0，
            for(int i=0;i<x;i++){
                System.out.print("输入第"+(i+1)+"个数字：");
                kl[i]=in.nextDouble();
                sum+=kl[i];
            }
            System.out.printf("均值是："+"%.2f",(sum/x));
            System.out.println();
            for (int j=0;j<kl.length;j++) {//使用length一定程度上保障了程序的拓展性
                if (kl[j] > (sum / x)) {
                    System.out.println("大于均值的数字是：" + kl[j]);
                }
            }
        }

    }
}
