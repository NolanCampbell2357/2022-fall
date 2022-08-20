package apps;

public class Practice1 {

    private static int addTwo(int a, int b) {
        return a + b;
    }

    private static int sumFromTo(int a, int b) {
        // return the sum of a through b
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    private static int power(int base, int exp) {
        // returns base to the power of exp
        // Assume >= 0
        // power(2, 3) returns 8
        // power(3, 2) returns 9

        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    private static void displayNumbers(int end) {
        // display 1 through given end
        for (int i = 1; i <= end; i++) {
            System.out.print(i);
            System.out.print((i % 10 == 0 ? "\n" : " "));
        }
    }

    public static void main(String[] args) {
//        System.out.println(1+2);
//        System.out.println(1 + 2 * 3); // 7
//        System.out.println(1 + 6 / 2 * 3); // 10
//        System.out.println(1<2 && 10 < 3);
//        System.out.println("2 + 3 = " + (2 + 3));
//
//        // display "Hello World" ten times
//        for(int i = 0; i < 10; i++) {
//            System.out.println("Hello World");
//        }
//
//        // display 1 through 100
//        for(int i = 1; i <= 100; i++) {
//            System.out.print(i);
//            System.out.print((i % 10 == 0 ? "\n": " "));
//        }

//        System.out.println(addTwo(5, 5)); // 10
//        System.out.println(addTwo(-3, 5)); // 2
//
//        System.out.println(sumFromTo(2, 3)); // 5
//        System.out.println(sumFromTo(2, 4)); // 9
//        System.out.println(sumFromTo(2, 2)); // 2
//        System.out.println(sumFromTo(1,9)); // 45

//        System.out.println(power(2, 3)); // 8
//        System.out.println(power(3, 2)); // 9
//        System.out.println(power(2, 8)); // 256
//        System.out.println(power(5, 1)); // 5
//        System.out.println(power(2, 32));
//        System.out.println(power(5, 0));
//        System.out.println(addTwo(power(2, 3), power(3, 2))); // 17
//        System.out.println(addTwo(power(2, 3), sumFromTo(power(2, 2), addTwo(3, 4)))); // 30

        displayNumbers(25);
        displayNumbers(155);
    }
}
