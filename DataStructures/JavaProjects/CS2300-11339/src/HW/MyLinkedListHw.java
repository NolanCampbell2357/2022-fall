package HW;

public class MyLinkedListHw<E> {
    int numElements;
    SLLNode<E> head;

    public MyLinkedListHw() {
        numElements = 0;
        head = null;
    }

    public MyLinkedListHw(E[] elements) { // O(elements.length)
        for (int i = elements.length - 1; i >= 0; i--)
            add(elements[i]);
    }

    public void printLinkedList() { // O(N)
        System.out.printf("printLinkedList(%d): ", numElements);
        SLLNode<E> node = head;
        while (node != null) {
            System.out.print(node.info + " ");
            node = node.next; // move 'node' to the next one
        }
        System.out.println();
    }

    public void add(E val) { // O(1)
        SLLNode<E> newNode = new SLLNode<E>(val);
        newNode.next = head;
        head = newNode;
        numElements++;
    }

    SLLNode<E> search(E val) { // O(1) ~ O(numElements)
        // return the node that has the same value as val
        // if val is not found, return null;
        SLLNode<E> node = head;
        while (node != null) {
            // compare and return if match
            if (node.info.equals(val))
                return node;
            node = node.next; // move 'node' to the next one
        }
        // val is not found
        return null;
    }

    public void remove(E val) { // O(1) ~ O(numElements)
        SLLNode<E> node = head, prev = null;
        while (node != null) {
            if (node.info.equals(val)) {
                if (prev == null)
                    head = node.next;
                else
                    prev.next = node.next;
                numElements--;
                return;
            }
            prev = node;
            node = node.next;
        }
    }

    public E get(int idx) { // O(idx)
        // return the value at the given index
        // eg) For a list {10,20,30,40}, get(2) will return 30
        // Assume that idx is valid, i.e. 0<= idx < size()

        SLLNode<E> node = head;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }

        return node.info;
    }

    public void set(int idx, E val) { // O(idx)
        // set the node's value at the given index with given value
        // eg) For a list {10,20,30,40}, set(2,100) will change it into {10,20,100,40}
        // Assume that idx is valid, i.e. 0<= idx < size()

        SLLNode<E> node = head;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }

        node.info = val;
    }

    public void addAt(int idx, E val) { // O(idx)
        // insert a node of given value at the given index while pushing some nodes to
        // the right
        // eg) For a list {10,20,30,40}, addAt(2,100) will change it into
        // {10,20,100,30,40}
        // Hint: You may want to stop at idx-1 position to make connections.
        // Assume that idx is valid, i.e. 0<= idx <= size()

        SLLNode<E> prev = head;
        SLLNode<E> newNode = new SLLNode<E>(val);

        numElements++;

        if (idx == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        for (int i = 0; i < idx - 1; i++) {
            prev = prev.next;
        }

        newNode.next = prev.next;
        prev.next = newNode;
    }

    public E[] toArray() { // O(numElements)
        // return an array that contains all the elements in the list

        if (numElements == 0) {
            return null;
        }

        E[] arr = (E[]) java.lang.reflect.Array.newInstance(head.info.getClass(), numElements);

        SLLNode<E> node = head;
        for (int i = 0; i < numElements; i++) {
            arr[i] = node.info;
            node = node.next;
        }

        return arr;
    }

    public MyLinkedListHw<E> clone() { // O(numElements)
        // return a copy of 'this' object.
        // The cloned list and 'this' list should not share any node.
        // In other words, any change to the cloned list should should not cause any
        // change to 'this' list. vice versa.

        E[] arr = toArray();

        MyLinkedListHw<E> clone = new MyLinkedListHw<E>(arr);

        return clone;
    }

    public void removeAll(E val) { // O(numElements)
        // remove all the nodes with given value
        // eg) If the list is {10, 20, 10, 10, 30}, removeAll(10) will change it as {20,
        // 30}

        SLLNode<E> node = head, prev = null;
        while (node != null) {
            if (node.info.equals(val)) {
                if (prev == null)
                    head = node.next;
                else
                    prev.next = node.next;
                numElements--;
            } else {
                prev = node;
            }
            node = node.next;
        }

    }
}