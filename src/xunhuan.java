import java.util.Scanner;

public class xunhuan {
    public static void main (String[] args){
        Scanner in =new Scanner(System.in);
        int i = 1,j=2,count=100;
        System.out.print("请输入一个数：");
        while(in.nextInt()==1){//一个最基础的while循环
            System.out.println(i);
        }

        do{//一个最基础的do-while循环
            System.out.println(j);
        }while(in.nextInt()==2);

        while(count>=0){//计数循环
            count=count-1;
//            System.out.println(count);
        }
        System.out.println("发射"+count);

        int number;//用while循环来算平均数
        int sum=0;
        int leijia=0;
        number = in.nextInt();
        while(number != -1){
            sum=sum+number;
            leijia=leijia+1;
            number=in.nextInt();
        }
        System.out.println("平均数是"+((1.0*(sum))/leijia));
    }
}
