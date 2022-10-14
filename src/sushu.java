import java.util.Scanner;

public class sushu {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int x=in.nextInt();
        for (int i=2;i<x;i++) {
            if (x % i == 0) {
                System.out.println(x + "不是素数,i=" + i);
            } else {
                System.out.println(x + "是素数,i=" + i);
            }
            break;//break可以单独用在每一个if-else分支中，也可以提取公共部分将其拿出来
        }
    }
}
