import java.util.Scanner;

public class panduan {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);//定义从键盘获得输入
        System.out.print("输入您支付的价格（票价为10）：");//最简单的分支判断
        int bjs=in.nextInt();
        if (bjs>=10){
            System.out.println("票价为"+10+";应找零"+(bjs-10));
        }
        else{
            System.out.println("金额不足");
        }
        int type=in.nextInt();
        switch(type){//switch-case语法实现的更方便的多路分支判断
            case 1:
                System.out.println("你好");
                break;//用于结束，否则会把后面的全输出
            case 2:
                System.out.println("金额不足");
                break;
            case 3:
                System.out.println("滚蛋");
                break;
            case 4:
                System.out.println("凑凑凑");
                break;
            case 5:
                System.out.println("啊？？？");
                break;
            default:
                System.out.println("瞎输入啥呢你");
        }
    }
}
