import java.util.Scanner;

public class qiuhe {//计算1-1/2+1/3-1/4......
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int x=in.nextInt();
        double sum=0.0;
        int sign=1;
        for (int i=1;i<=x;i++){
            sum+=sign*1.0/i;
            sign=-sign;
        }
        System.out.println(sum);
        System.out.printf("%.2f",sum);//c语言里常用的语法Java里也有
    }
}
