import java.util.Scanner;

public class tyZf {
    public static void main(String[] args){
        //Java 中的逃逸字符用于在字符串和字符常量中表示特殊字符，它们通常是在字符前面加上一个反斜线 () 来表示。
        //下面是一些常见的逃逸字符的用法:
        // \n: 换行符，用于在字符串中换行。
        // \r: 回车符，用于在字符串中回到行首。
        // \t: 制表符，用于在字符串中插入一个制表位。
        // \': 单引号，用于在字符串中表示单引号字符。
        // \": 双引号，用于在字符串中表示双引号字符。
        // \\: 反斜线，用于在字符串中表示反斜线字符。
        System.out.println("Hello\nworld!");
// 输出: Hello
        // world!

        System.out.println("Hello\tworld!");
// 输出: Hello    world!

        System.out.println("He said:\"Hello, world!\"");
// 输出: He said:"Hello, world!"

        System.out.println("The file is located at c:\\documents\\files\\file.txt");
// 输出: The file is located at c:\documents\files\file.txt
        //总之，逃逸字符在字符串和字符常量中插入特殊字符时非常有用,在文本中换行、缩进、引用等都可以使用逃逸字符来达成。
    }
}

