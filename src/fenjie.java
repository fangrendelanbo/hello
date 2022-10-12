import java.util.Scanner;

public class fenjie {//整数分解
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("输入一个小于十亿的整数：");
        int a = in.nextInt();
        int b = 0;
        int digit;
        do {
            digit = a % 10;
            if (b==0){
            System.out.println("个位是：" + digit);
            }
            if (b==1){
                System.out.println("十位是：" + digit);
            }
            if (b==2){
                System.out.println("百位是：" + digit);
            }
            if (b==3){
                System.out.println("千位是：" + digit);
            }
            if (b==4){
                System.out.println("万位是：" + digit);
            }
            if (b==5){
                System.out.println("十万位是：" + digit);
            }
            if (b==6){
                System.out.println("百万位是：" + digit);
            }
            if (b==7){
                System.out.println("千万位是：" + digit);
            }
            if (b==8){
                System.out.println("亿位是：" + digit);
            }
            b=b+1;
            a = a / 10;
        } while (a > 0);
    }
}
