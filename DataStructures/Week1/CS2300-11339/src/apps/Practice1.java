package apps;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(1+2);
        System.out.println(1 + 2 * 3); // 7
        System.out.println(1 + 6 / 2 * 3); // 10
        System.out.println(1<2 && 10 < 3);
        System.out.println("2 + 3 = " + (2 + 3));

        // display "Hello World" ten times
        for(int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }

        // display 1 through 100
        for(int i = 1; i <= 100; i++) {
            System.out.print(i);
            System.out.print((i % 10 == 0 ? "\n": " "));
        }
    }
}
