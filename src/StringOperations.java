import java.util.Scanner;

public class StringOperations {//字符串的一些操作
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        input.close();

        System.out.println("用于获取字符串的长度: " + str.length());

        System.out.println("用于将字符串中的所有字符转换为大写: " + str.toUpperCase());
        System.out.println("用于将字符串中的所有字符转换为小写: " + str.toLowerCase());

        System.out.println("用于获取字符串中指定字符的第一次出现的位置: " + str.indexOf('a'));
        System.out.println("用于获取字符串中指定字符的最后一次出现的位置: " + str.lastIndexOf('a'));

        System.out.println("用于截取字符串的一部分，其中两个参数分别指定开始和结束位置(x处起始，y处之前): " + str.substring(3, 7));

        System.out.println("用于替换字符串中的某个字符: " + str.replace('a', 'X'));

        System.out.println("用于将一个字符串拼接到另一个字符串的末尾: " + str.concat(" - appended"));

        System.out.println("用于获取字符串中指定位置的字符: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
//        这段代码使用了以下字符串操作：

//        length()：用于获取字符串的长度。

//        toUpperCase()：用于将字符串中的所有字符转换为大写。
//
//        toLowerCase()：用于将字符串中的所有字符转换为小写。
//
//        indexOf(char)：用于获取字符串中指定字符的第一次出现的位置。
//
//        lastIndexOf(char)：用于获取字符串中指定字符的最后一次出现的位置。
//
//        substring(int, int)：用于截取字符串的一部分，其中两个参数分别指定开始和结束位置。
//
//        replace(char, char)：用于替换字符串中的某个字符。
//
//        concat(String)：用于将一个字符串拼接到另一个字符串的末尾。
//
//        charAt(int)：用于获取字符串中指定位置的字符。
//
//        除了以上操作，Java 还提供了一些其他的字符串操作，例如判断字符串是否为空、是否以某个字符串开头或结尾、比较两个字符串是否相等等。使用这些操作前请确保对 Java 的字符串类型有所了解。
//



