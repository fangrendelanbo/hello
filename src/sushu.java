import java.util.Scanner;

public class sushu {//素数判断，保留①部分表示输入判断素数，保留②部分遍历一个区间输出全部的素数，保留③部分用于输出指定个数个素数
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);//①
//        System.out.print("输入一个数：");//①
//        int x=in.nextInt();//输入判断素数①
        int  x;//②③
        int jishu=0;//②③
        for(x=2;x<=500;x++){//遍历一个区间输出全部的素数②，③
            int i;//①②③
            boolean y=true;//①②③,逻辑类型boolean
            for (i = 2; i<x; i++) {//①②③
                if (x % i == 0) {//①②③
//                    System.out.println(x + "no");//①
                    y=false;//①②③
                    break;//循环控制①②③
                }
            }
            if (y&&jishu<=50){//①②，’jishu‘计数器，用于输出指定个数个素数（此处输出50个）③
                System.out.println(x + "yes");//①②③
                jishu=jishu+1;//③
            }
        }
    }
}
