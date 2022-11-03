package Lecture;

public class TreeDemo {

    public static void main(String[] args) {

    BSTNode<Integer> root = new BSTNode<Integer>(10);
    BSTNode<Integer> node1 = new BSTNode<Integer>(20);
    BSTNode<Integer> node2 = new BSTNode<Integer>(30);

    root.left = node1;
    root.right = node2;

    root.interOrder();
    }
}
