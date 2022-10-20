import java.util.Scanner;

public class sushu {//素数判断
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.print("输入一个数：");
//        int x=in.nextInt();
        int  x;
        for(x=2;x<=100;x++){
            int i;
            int y=0;
            for (i = 2; i<x; i++) {
                if (x % i == 0) {
                    System.out.println(x + "no");
                    y=1;
                    break;//循环控制
                }
            }
            if (y==0){
                System.out.println(x + "yes");
            }
        }
    }
}
