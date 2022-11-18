package Lecture;

public class BSTNode<E> {
    E info;
    BSTNode<E> left, right;

    public BSTNode(E val) {
        info = val;
        left = null;
        right = null;
    }

    public void preOrder() {
        preOrder(this);
    }

    public void preOrder(BSTNode<E> node) {
        if (node == null) {
            return;
        }

        System.out.print(node.info + ", ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void interOrder() {
        interOrder(this);
    }

    void interOrder(BSTNode<E> node) {
        if (node == null) {
            return;
        }

        interOrder(node.left);
        System.out.print(node.info + ", ");
        interOrder(node.right);
    }

    public void postOrder() {
        postOrder(this);
    }

    void postOrder(BSTNode<E> node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.info + ", ");
    }

    static int sumAll(BSTNode<Integer> node) {
        if(node == null) {
            return 0;
        }

        return node.info + sumAll(node.left) + sumAll(node.right);
    }

    public String toString() {
        return "BSTNode("+info+")";
    }
}
