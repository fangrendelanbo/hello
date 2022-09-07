public class zhuanhuan {
    public static void main(String[] args){
        int bjs=100;
        System.out.println(bjs);
        System.out.println(bjs*1.0);//自动转换成浮点数（更高的精度可以自动转换）
        double kl=100,lk=100.5;
        System.out.println(kl+"与"+lk);
        System.out.println((int)kl+"与"+(int)lk);//强制转换成int（高精度转换成低精度需要手动）
    }
}
