package Lecture;

public class TreeDemo {

    public static void main(String[] args) {

        BSTNode<Integer> node7 = new BSTNode<Integer>(40);
        BSTNode<Integer> node1 = new BSTNode<Integer>(20);
        BSTNode<Integer> node2 = new BSTNode<Integer>(60);

        BSTNode<Integer> node3 = new BSTNode<Integer>(10);
        BSTNode<Integer> node4 = new BSTNode<Integer>(30);

        BSTNode<Integer> node5 = new BSTNode<Integer>(50);
        BSTNode<Integer> node6 = new BSTNode<Integer>(70);


        node4.left = node3;
        node4.right = node7;

        node3.right = node1;

        node5.left = node4;
        node5.right = node6;

        node6.left = node2;
        
        node5.preOrder(); 
        System.out.println();
        node5.interOrder(); // 10 20 30 40 50 60 70
        System.out.println();
        node5.postOrder(); 
        System.out.println();

        System.out.println(BSTNode.sumAll(node5));
    }
}
