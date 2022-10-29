package Lecture;

public class MyQueueDemo {
    public static void main(String[] args) {
        MyQueue<Integer> q1 = new MyQueue<Integer>();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);

        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());

        q1.enqueue(6);
        q1.enqueue(7);
        q1.enqueue(8);
        q1.enqueue(9);
        q1.enqueue(10);
        q1.enqueue(11);
        q1.enqueue(12);

       System.out.println(q1.dequeue());
    }
}