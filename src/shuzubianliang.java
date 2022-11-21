import java.util.Scanner;

public class shuzubianliang {//补充些数组知识
    public static void main(String[] args){
        System.out.println();
        int[] kl={12,56,98,24,6,45,798,4,646,4664,};//直接赋值创建数组
        System.out.println("kl的长度为："+kl.length);//查看kl的长度
        System.out.print("kl的每个元素为：");
        for (int i=0;i<kl.length;i++){//保持拓展性，kl的元素发生变化也无需修改此处
            System.out.print(kl[i]+" ");
        }

        System.out.println();
        System.out.print("a的每个元素为：");
        int a[]=new int[5];
        for (int i=0;i<a.length;i++){//保持拓展性，kl的元素发生变化也无需修改此处
            System.out.print(a[i]+" ");//还未对a赋值，每个元素还是默认的0
        }
        System.out.println();
        a[0]=5;
        int b[]=a;//数组b经过赋值进行创建，并不会开拓新的存储单元，本质上b[]与a[]都是实际存储单元的管理者，管理的是同一块数据，是管理权限的赋予
        System.out.println("a[0]是："+a[0]);//5
        System.out.println("b[0]是："+b[0]);//5
        b[0]=15;//所以就可以看到对b进行操作影响了a中的数据
        System.out.println("a[0]是："+a[0]);//15
        System.out.println("b[0]是："+b[0]);//15

        int c[]=new int[5];
        c[0]=15;
        System.out.print("a与c相等吗:");
        System.out.println(a==c);//false,不能直接比较数组，哪怕各项特征及元素都相等
        boolean is=true;
        for (int i=0;i<c.length;i++){
            if (a[i]!=c[i]){
                is=false;
                break;
            }
        }
        System.out.print("a与c相等吗:");
        System.out.println(is);//true，可以手动判断是否相等,同理想要将一个数组的元素赋值给另一个数组也必须循环遍历赋值
    }
}
