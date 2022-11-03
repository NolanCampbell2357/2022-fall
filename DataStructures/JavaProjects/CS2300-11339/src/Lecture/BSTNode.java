package Lecture;

public class BSTNode<E> {
    E info;
    BSTNode<E> left, right;

    public BSTNode(E val) {
        info = val;
        left = null;
        right = null;
    }

    void preOrder() {

    }

    void interOrder() {
        interOrder(this);
    }

    void interOrder(BSTNode<E> root) {
        if(root == null) {
            return;
        }

        interOrder(root.left);
        System.out.print(root.info + ", ");
        interOrder(root.right);
    }

    void postOrder() {

    }
}
