package Lecture;

public class MyLinkedList<E> {
    int numElements;
    SLLNode<E> head;

    public MyLinkedList() {
        numElements = 0;
        head = null;
    }

    public void add (E val) {
        SLLNode<E> node = new SLLNode<E>(val);
        node.setNext(head);
        head = node;
    }

    public void printLinkedList() {
        SLLNode<E> node = head;

        String result = "printLinkedList("+numElements+")[ ";
        while (node != null) {
            result += node.toString() + " ";
            node = node.next();
        }
        result += "]";
        System.out.println(result);
    }

    public SLLNode<E> search(E val) {
        SLLNode<E> node = head;

        while(node != null && node.info != val) {
            node = node.next();
        }

        return node;
    }

}
