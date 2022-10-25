package Lecture;

public class MyStackDemo {

    public static void main(String[] args) {

        MyStackLL2<Integer> st4 = new MyStackLL2<Integer>();

        st4.push(5);
        st4.push(6);
        st4.push(7);
        st4.push(8);

        System.out.println(st4.toString());

        System.out.println(st4.pop());
        System.out.println(st4.peek());

        System.out.println(st4.toString());

        // MyStackLL<Integer> st3 = new MyStackLL<Integer>();

        // st3.push(5);
        // st3.push(6);
        // st3.push(7);
        // st3.push(8);

        // st3.print();

        // System.out.println(st3.pop());
        // System.out.println(st3.peek());

        // st3.print();

        // MyStack2<Integer> st1 = new MyStack2<Integer>();

        // st1.push(5);
        // st1.push(6);
        // st1.push(7);
        // st1.push(8);

        // st1.printArr();

        // System.out.println(st1.pop());
        // System.out.println(st1.peek());
        // st1.printArr();
    }
}
