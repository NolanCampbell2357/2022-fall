package Lecture;

public class SLLNode<E> {
    SLLNode<E> next;
    E info;

    public SLLNode(E info) {
        this.info = info;
        next = null;
    }

    public void setNext(SLLNode<E> next) {
        this.next = next;
    }

    public SLLNode<E> next() {
        return next;
    }

    public static <E> void printLinkedList(SLLNode<E> node) {
        String result = "[ ";
        while (node != null) {
            result += node.toString() + " ";
            node = node.next();
        }
        result += "]";
        System.out.println(result);
    }

    public static <E> SLLNode<E> generateLL(E ... node1) {

    }

    @Override
    public String toString() {
        return "info: " + info;
    }
}
