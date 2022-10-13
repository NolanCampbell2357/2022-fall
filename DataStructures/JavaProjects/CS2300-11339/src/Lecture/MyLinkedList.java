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
        numElements++;
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

        while(node != null && !node.info.equals(val)) {
            node = node.next();
        }

        return node;
    }

    public void remove(E val) {
        SLLNode<E> node = head;

        if(numElements == 0) {
            return;
        }

        if(head.info == val) {
            head = head.next();
            numElements--;
            return;
        }

        while(node.next() != null) {
            if(node.next().info.equals(val)) {
                node.setNext(node.next().next());
                numElements--;
                return;
            }
            node = node.next();
        }

    }

    public void repeatEach() {
        // Create and insert a new node for each element with the same value
        // eg) this.head = {10, 20, 30}, change to {10, 10, 20, 20, 30, 30}
        SLLNode<E> node = head;

        while (node != null) {
            SLLNode<E> copy = new SLLNode<E>(node.info);
            SLLNode<E> next = node.next();

            if(next != null) {
                copy.setNext(next);
            }

            node.setNext(copy);
            node = next;
            numElements++;
        }

    }

}
