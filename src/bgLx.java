public class bgLx {
    public static void main(String[] args){
        //Java 中包裹类型是基本数据类型的高级形式，可以在对象中包装基本数据类型。
        // 这些包装类型是由 Java 的自动装箱功能自动创建的。下面是几种常见的 Java 包装类型的用法:
        //Integer: 表示一个整数。可以使用静态方法 parseInt() 将字符串转换为 int 类型。
        //Integer x = new Integer(10);
        Integer y = Integer.parseInt("100");

        //Double: 表示一个双精度浮点数。可以使用静态方法 parseDouble() 将字符串转换为 double 类型。
        //Double a = new Double(10.5);
        Double b = Double.parseDouble("10.5");
        double e = 10.5;
        double t = b;
        Double p = b;
        System.out.println(b);
        System.out.println(e);
        System.out.println(t);
        System.out.println(p);
        //包裹类型一样可以进行赋值等操作

        //Character: 表示一个字符。可以使用静态方法 toUpperCase() 或 toLowerCase() 将字符转换为大写或小写。
        //Character c = new Character('A');
        Character d = Character.toUpperCase('b');

        //Boolean: 表示一个布尔值。可以使用静态方法 parseBoolean() 将字符串转换为 boolean 类型。
        //Boolean isTrue = new Boolean(true);
        Boolean isFalse = Boolean.parseBoolean("false");

        //Byte: 表示一个字节。可以使用静态方法 parseByte() 将字符串转换为 byte

        //Short :表示一个短整数，可以使用静态方法 parseShort() 将字符串转换为 short 类型。
        //Short x1 = new Short((short) 10);
        Short y1 = Short.parseShort("100");

        //Long :表示一个长整数，可以使用静态方法 parseLong() 将字符串转换为 long 类型。
        //Long x2 = new Long(100L);
        Long y2 = Long.parseLong("100");

        //Float : 表示一个单精度浮点数，可以使用静态方法 parseFloat() 将字符串转换为 float 类型。
        //Float a1 = new Float(10.5f);
        Float b1 = Float.parseFloat("10.5");

        //另外，所有的包装类型都有一个静态的 valueOf() 方法，可以直接将一个基本数据类型转换为相应的包装类型，例如:
        Integer x3 = Integer.valueOf(10);
        Boolean isTrue1 = Boolean.valueOf(true);

        //包裹类型提供了一些实用的静态方法，比如可以将字符串转换为相应的基本数据类型,由于包装类型是对象，
        // 因此可以将它们用于所有需要对象的地方,比如在集合中使用。

        //总之，包装类型提供了很多有用的静态方法和实用功能，可以在使用基本数据类型时帮助我们解决许多问题。
    }
}
