import java.util.Scanner;

public class caishu {//猜数字游戏
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int number=1;
        int a=(int)(Math.random()*100+1);
        System.out.print("输入一个数：");
        int b=in.nextInt();
        while(a != b){//while循环方法
            if (a>b){
            System.out.println("偏小");
            System.out.println("再输入一个数：");
            b=in.nextInt();
            number=number+1;
            }
            if (a<b){
                System.out.println("偏大");
                System.out.println("再输入一个数：");
                b=in.nextInt();
                number=number+1;
            }
        }
//        Scanner in =new Scanner(System.in);
//        int number=0;
//        int b;
//        int a=(int)(Math.random()*100+1);
//        do {//do-while循环方法
//            System.out.print("输入一个数：");
//            b=in.nextInt();
//            number=number+1;
//            if (b>a){
//                System.out.println("偏大");
//            }
//            if (b<a){
//                System.out.println("偏小");
//            }
//        }while(a!=b);
        System.out.println("猜对啦，猜了"+number+"次");
    }
}
