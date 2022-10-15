package Lecture;

public class RecursionDemo {
    static int factorial(int n) {
        System.out.printf("Factorial(%d)\n", n);
        if (n == 1) {
            return 1;
        }
        int res = n * factorial(n - 1);
        System.out.printf("Factorial(%d) about to return %d\n", n, res);
        return res;
    }

    /*
     * factorial(4)
     * factorial(3)
     * factorial(2)
     * factorial(1)
     * factorial(2) about to return 2
     * factorial(3) about to return 6
     * factorial(4) about to return 24
    */

    static int sumUpTo(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUpTo(n-1);
    }

    static int sumFromTo(int a, int b) {
        // Return the sum from a to b a + (a + 1) + ... + (b-1) + b
        // Assume a <= b
        return a == b ? b : a + sumFromTo(a+1, b) ;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(sumUpTo(5));

        System.out.println(sumFromTo(1, 5));
    }
}
