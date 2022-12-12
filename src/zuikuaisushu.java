public class zuikuaisushu {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {//去除1,2，从3开始每次加2，加到n的平方根
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){//一种速度极快的素数判断
        System.out.println(isPrime(5));//true
        System.out.println(isPrime(6));//false
        System.out.println(isPrime(9));//false
        System.out.println(isPrime(7));//true
        System.out.println(isPrime(98));//false
        System.out.println(isPrime(575));//false
    }
}
