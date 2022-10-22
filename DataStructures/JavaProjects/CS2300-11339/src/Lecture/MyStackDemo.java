package Lecture;

public class MyStackDemo {
    
    public static void main(String[] args) {
        MyStack<Integer> st1 = new MyStack<Integer>();

        st1.push(5);
        st1.push(6);
        st1.push(7);
        st1.push(8);

        st1.printArr();

        System.out.println(st1.pop());
        System.out.println(st1.peek());
        st1.printArr();
    }
}
