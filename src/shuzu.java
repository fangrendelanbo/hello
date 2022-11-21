import java.util.Scanner;

public class shuzu {//输入一组数，输出均值和大于均值的数
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.print("输入数组长度：");
        int x=in.nextInt();
        double sum=0;
        if (x>0){
            double[] kl=new double[x];
            for(int i=0;i<x;i++){
                System.out.print("输入第"+(i+1)+"个数字：");
                kl[i]=in.nextDouble();
                sum+=kl[i];
            }
            System.out.printf("均值是："+"%.2f",(sum/x));
            System.out.println();
            for (int j=0;j<kl.length;j++) {
                if (kl[j] > (sum / x)) {
                    System.out.println("大于均值的数字是：" + kl[j]);
                }
            }
        }

    }
}
