import java.util.Scanner;

public class gys {//求两个数的最大公约数
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        //普通办法↓
        int jieguo;
        if (a==0&&b!=0){
            System.out.println(a+"和"+b+"的最大公约数为： "+b);
        }
        if (b==0&&a!=0){
            System.out.println(a+"和"+b+"的最大公约数为： "+a);
        }
        if (a==0&&b==0){
            System.out.println(a+"和"+b+"没有最大公约数");
        }
        if (a!=0&&b!=0){
            for (int i=a;i>=1;i--){//此处i=a，也可以等于b，因为下面限制了i<=a且i<=b,就不用纠结是否从相对较小的数出发了
                if (i<=a && i<=b && a%i==0 && b%i==0){
                    jieguo=i;
                    System.out.println(a+"和"+b+"的最大公约数为： "+jieguo);
                    break;
                }
            }
        }
        //普通办法↑

        //辗转相除法（欧几里德法）↓
        if (a==0&&b==0){
            System.out.println(a+"和"+b+"没有最大公约数");
        }
        if (a==0&&b!=0){
            System.out.println(a+"和"+b+"的最大公约数为： "+b);
        }
        if (b==0&&a!=0){
            System.out.println(a+"和"+b+"的最大公约数为： "+a);
        }
        int oa=a;
        int ob=b;
        if (a!=0&&b!=0){
            while(b!=0){
                int r=a%b;

                a=b;
                b=r;
            }
        }
        System.out.println(oa+"和"+ob+"的最大公约数为： "+a);
        //辗转相除法（欧几里德法）↑
    }
}
