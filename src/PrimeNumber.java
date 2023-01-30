public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 11;
        boolean isPrime = isPrime(number);
        System.out.println(number + " is a prime number: " + isPrime);
    }
}
//        一个关于自定义函数的简单举例

//        在这段代码中，我们定义了一个名为 isPrime() 的静态方法，用于判断一个数是否是素数。
//        该方法接收一个 int 类型的数字作为参数，并返回一个 boolean 类型的值，表示该数是否是素数。
//
//        首先，如果该数小于等于 1，那么它不是素数，因此我们返回 false。然后，
//        我们从 2 开始枚举该数的因数，并在找到该数的任意一个因数时，立即返回 false。
//        如果枚举到最后都没有找到任意一个因数，那么这个数就是素数，因此我们返回 true。
//
//        在 main 方法中，我们调用了 isPrime() 方法，并打印了该方法的返回值。
//        当然，你可以把该类打包成一个 jar 包，然后在其他程序中使用，以判断任意一个数是否是素数。


//使用自定义函数有很多好处：
//
//可读性：自定义函数可以使代码变得更加清晰易读。例如，如果您想写一个复杂的算法，把它放在一个函数中将使代码更易于理解和维护。
//
//可复用性：自定义函数是可以多次使用的，可以在多个程序中重复使用。这使您可以更有效地利用代码，并避免了重复编写代码的时间。
//
//封装性：自定义函数可以隐藏代码的细节，使代码更加简洁和整洁。您可以使用函数实现特定功能，但不需要暴露所有代码的细节。
//
//测试性：自定义函数可以单独测试，如果函数出现问题，您可以通过调试函数来解决问题。这使您可以快速定位和解决问题。
//
//总之，使用自定义函数可以使代码更加简洁，可读性更高，更易于维护、扩展和优化，并使代码更加可测试。