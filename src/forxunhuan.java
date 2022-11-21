import java.util.Scanner;

public class forxunhuan {//for循环计算阶乘
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.print("输入一个数：");
        int a=in.nextInt();
        int i;
        int b = 1;
        for (i=1;i<=a;i++){
            b=b*i;
        }
        System.out.println("他的阶乘是："+b);
    }
}
