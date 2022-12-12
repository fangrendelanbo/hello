public class erweiShuzu {
    public static void main(String[] args) {//在java中创建一个5*5的二维数组，每个元素的值就是其下标的乘积
        //int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//另一种定义数组方式，如有缺少会在后面自动补0

        int[][] array = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = i * j;
                System.out.print(array[i][j]+",");
            }
        }
    }
}
