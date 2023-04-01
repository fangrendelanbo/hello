package kl11;

public class JVLI {
    //举例类是怎么被实例化或者使用的
public static void main(String[] args) {
        //创建一个随机数组
        int[] array = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        //实例化一个对象
        //打印原始数组
        QuickSort quickSort = new QuickSort();
        System.out.println("原始数组：");
        quickSort.printArray(array2);
        //对数组进行排序
        quickSort.sort(array2);
        //打印排序后的数组
        System.out.println("排序后的数组：");
        quickSort.printArray(array2);
        //这里的printArray和sort方法都是非静态方法，所以必须使用对象来调用

        //静态方法是属于类的，非静态方法是属于对象的

        //直接调用静态方法
        //打印原始数组
        System.out.println("原始数组：");
        QuickSort.printArray(array);
        //对数组进行排序
        QuickSort.sort(array);
        //打印排序后的数组
        System.out.println("排序后的数组：");
        QuickSort.printArray(array);
        //这里的printArray和sort方法都是静态方法，所以可以直接调用
        //这里的QuickSort类是怎么被实例化的呢？
        //在这里，QuickSort类是被实例化了两次，一次是在main方法中，一次是在printArray方法中
        //但是，这两次实例化的对象是不同的，因为他们是在不同的内存地址中
        //所以，这里的QuickSort类是怎么被实例化的呢？其实，这里的QuickSort类是被编译器自动实例化了
        //编译器在编译的时候，会自动在每个类中添加一个静态的main方法
        //在这个main方法中，会自动调用类中的静态方法
        //所以，这里的QuickSort类是被编译器自动实例化了

        //静态方法和非静态方法的区别
        //静态方法是属于类的，非静态方法是属于对象的
        //静态方法可以直接使用类名调用，非静态方法必须使用对象来调用
        //静态方法中不能使用this关键字，非静态方法中可以使用this关键字
        //静态方法中不能直接访问非静态成员变量，非静态方法中可以直接访问非静态成员变量
        //静态方法中不能直接调用非静态方法，非静态方法中可以直接调用非静态方法
        //静态方法中不能使用super关键字，非静态方法中可以使用super关键字



    }

}
