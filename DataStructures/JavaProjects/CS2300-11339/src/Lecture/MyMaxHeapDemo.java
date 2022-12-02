package Lecture;

public class MyMaxHeapDemo {
    public static void main(String[] args) {
        MyMaxHeap<Integer> q1 = new MyMaxHeap<Integer>();

        q1.enqueue(2);
        q1.printQueue();
        q1.enqueue(10);
        q1.printQueue();
        q1.enqueue(15);
        q1.enqueue(20);
        q1.enqueue(14);
        q1.printQueue();

        System.out.println(q1.dequeue());
        q1.printQueue();
        System.out.println(q1.dequeue());
        q1.printQueue();
        System.out.println(q1.dequeue());
        q1.printQueue();

        q1.enqueue(30);
        q1.enqueue(25);
        q1.printQueue();
    }
}
