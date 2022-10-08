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

    public static <E> SLLNode<E> getNode(SLLNode<E> ls, int idx) {
        for(int i = 0; i < idx; i++) {
            if(ls.next() == null) {
                return null;
            }
            ls = ls.next();
        }
        return ls;
    } 

    public static <E> void remove2nd(SLLNode<E> ls) {
        ls.setNext(ls.next().next());
    }

    @SafeVarargs
    public static <E> SLLNode<E> generateLL(E... nodeIds) {

        SLLNode<E> currentNode = null;
        SLLNode<E> nextNode = null;
        for (int i = nodeIds.length-1; i >= 0; i--) {
            currentNode = new SLLNode<E>(nodeIds[i]);
            currentNode.next = nextNode;
            nextNode = currentNode;
        }

        return currentNode;
    }

    public static SLLNode<Integer> generateLL(int count) {

        SLLNode<Integer> currentNode = null;
        SLLNode<Integer> nextNode = null;
        for (int i = count; i > 0; i--) {
            currentNode = new SLLNode<Integer>(i);
            currentNode.next = nextNode;
            nextNode = currentNode;
        }

        return currentNode;
    }

    @Override
    public String toString() {
        return "info: " + info;
    }
}
