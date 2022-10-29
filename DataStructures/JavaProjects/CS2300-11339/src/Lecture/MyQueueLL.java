package Lecture;

public class MyQueueLL<E> implements QueueInterface<E> {

    SLLNode<E> front, rear;

    @Override
    public void enqueue(E val) {
        SLLNode<E> newNode = new SLLNode<E>(val);

        if(rear == null) {
            front = newNode;
        } else {
            rear.setNext(newNode);
        }
        rear = newNode;
    }

    @Override
    public E dequeue() {
        if(isEmpty()) {
            return null;
        }

        E info = front.info;
        front = front.next();

        if(front == null) {
            rear = null;
        }

        return info;
    }

    boolean isEmpty() {
        return front == null;
    }
    
}
