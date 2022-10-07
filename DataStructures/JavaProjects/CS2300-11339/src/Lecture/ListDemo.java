package Lecture;

public class ListDemo {

    public static void main(String[] args) {
        SLLNode<Integer> node1 = new SLLNode<Integer>(1);
        SLLNode<Integer> node2 = new SLLNode<Integer>(2);
        SLLNode<Integer> node3 = new SLLNode<Integer>(3);
        SLLNode<Integer> node4 = new SLLNode<Integer>(4);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        SLLNode<Integer> current = node1;

        System.out.println(current);
        System.out.println(current.next());

        current = node1.next();
        System.out.println(current.next().next());

        current = node1;
        SLLNode.<Integer>printLinkedList(current);
    }
}
