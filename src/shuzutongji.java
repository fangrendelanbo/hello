import java.util.Scanner;

public class shuzutongji {
    public static void main(String[] args){//输入10个0-9的数，统计每个数出现的频率
        Scanner in =new Scanner(System.in);//定义从键盘获得输入
        int[] kl=new int[10];
        for (int j=0;j<kl.length;j++){
            int x=in.nextInt();
            for (int i=0;i<kl.length;i++){
                if (x==i){
                    kl[i]++;
                }
            }
        }
        for (int i=0;i<kl.length;i++){
            System.out.println(i+"有" + kl[i]+"个");
        }
    }
}
