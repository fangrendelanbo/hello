import java.util.Scanner;

public class hello {
    public static void main(String[] args){
        System.out.println("hello,world");//直接输出（println代表输出后自动跟一个回车，print不自动根回车）

        Scanner in =new Scanner(System.in);//定义从键盘获得输入
        System.out.println("输出：" + in.nextLine());//输出输入的内容（包括用“+”实现数据串连接）

        System.out.println("2+3=" + (2+3));//计算输出

        int BianL;//定义变量（未赋值即未初始化状态，现在不能直接使用）
        BianL=in.nextInt();//声明变量（赋值，之后就可以使用了）
        System.out.println("2+"+BianL+"="+(2+BianL));//键盘输入参与计算输出(变量)

        int bjs;//可以前面加 final 使其变成常量（例如final int bjs=100）
        bjs=in.nextInt();
        System.out.println(bjs+"+"+BianL+"="+(bjs+BianL));//进阶的键盘输入参与计算输出(变量)
        //浮点数计算同理，优先级也和实际相同
    }
}
