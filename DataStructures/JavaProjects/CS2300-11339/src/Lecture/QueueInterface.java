package Lecture;

public interface QueueInterface<E> {
    public void enqueue(E val);
    public E dequeue();
}
