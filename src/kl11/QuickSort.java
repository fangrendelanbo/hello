package kl11;
// 快速排序算法
public class QuickSort {

    // 对数组进行排序
    public static void sort(int[] array) {
        // 调用递归方法，传入数组，起始索引和结束索引
        quickSort(array, 0, array.length - 1);
    }

    // 递归方法，对数组的一部分进行排序
    private static void quickSort(int[] array, int start, int end) {
        // 如果起始索引大于等于结束索引，说明已经排序完成，直接返回
        if (start >= end) {
            return;
        }
        // 选择一个基准值，这里选择数组的第一个元素
        int pivot = array[start];
        // 定义两个指针，分别指向数组的两端
        int left = start;
        int right = end;
        // 循环交换左右指针所指向的元素，直到左右指针相遇或交叉
        while (left < right) {
            // 从右往左找到第一个小于基准值的元素，将其赋值给左指针所指向的位置
            while (left < right && array[right] >= pivot) {
                right--;
            }
            array[left] = array[right];
            // 从左往右找到第一个大于基准值的元素，将其赋值给右指针所指向的位置
            while (left < right && array[left] <= pivot) {
                left++;
            }
            array[right] = array[left];
        }
        // 将基准值放到左右指针相遇的位置，此时该位置左边的元素都小于等于基准值，右边的元素都大于等于基准值
        array[left] = pivot;
        // 对基准值左边的子数组进行递归排序
        quickSort(array, start, left - 1);
        // 对基准值右边的子数组进行递归排序
        quickSort(array, left + 1, end);
    }

    // 打印数组
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 测试方法
    public static void main(String[] args) {
        // 创建一个随机数组
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        // 打印原始数组
        System.out.println("原始数组：");
        printArray(array);
        // 对数组进行排序
        sort(array);
        // 打印排序后的数组
        System.out.println("排序后的数组：");
        printArray(array);
    }
}