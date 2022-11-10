package Lecture;

public class MyBST<E> {
    BSTNode<E> root;

    public void add(E val) {

        if(root == null) {
            root = new BSTNode<E>(val);
            return;
        }

        // BSTNode<E> node = root, parent = null;

        // while(node != null) {
        //     parent = node;

        //     if(((Comparable)val).compareTo(node.info) <= 0) {
        //         node = node.left;
        //     } else {
        //         node = node.right;

        //     }
        // }
        // BSTNode<E> newNode = new BSTNode<E>(val);

        // if(((Comparable)val).compareTo(parent.info) <= 0) {
        //     parent.left = newNode;
        // } else {
        //     parent.right = newNode;
        // }

        addHelper(root, val);
    }

    private void addHelper(BSTNode<E> node, E val) {
        if(((Comparable)val).compareTo(node.info) <= 0) {
            if(node.left == null) {
                BSTNode<E> newNode = new BSTNode<E>(val);
                node.left = newNode;
                return;
            }

            addHelper(node.left, val);
        } else {
            if(node.right == null) {
                BSTNode<E> newNode = new BSTNode<E>(val);
                node.right = newNode;
                return;
            }

            addHelper(node.right, val);
        }
    }

    public void remove(E val) {
        root = removeHelper(root, val);
    }

    public BSTNode removeHelper(BSTNode<E> node, E val) {

        if(node == null) {
            return null;
        }

        if(((Comparable)val).compareTo(node.info) < 0) {
            node.left = removeHelper(node.left, val);
        } else if (((Comparable)val).compareTo(node.info) > 0){
            node.right = removeHelper(node.right, val);
        } else {
            if(node.left == null && node.right == null) {
                return null;
            }

            if(node.left == null) {
                return node.right;
            } else if (node.right == null){
                return node.left;
            }

            return maxHelper(node.left); 
            //search and return
        }
    }

    E maxHelper(BSTNode<E> node) {

    }

    public BSTNode<E> search(E val) {
        return searchHelper(root, val);
    }

    private BSTNode<E> searchHelper(BSTNode<E> node, E val) {
        if(node == null) {
            return null;
        }

        if(val.equals(node.info)) {
            return node;
        }

        if(((Comparable)val).compareTo(node.info) <= 0) {
            return searchHelper(node.left, val);
        } else {
            return searchHelper(node.right, val);

        }
    }

    public E minimum() {
        BSTNode<E> node = root;
        if(node == null) {
            return null;
        }

        // while(node.left != null) {
        //     node = node.left;
        // }

        // return node.info;

        return minimumHelper(root);
    }

    private E minimumHelper(BSTNode<E> node) {
        if(node.left == null) {
            return node.info;
        }
        return minimumHelper(node.left);
    }

    public void print() {
        System.out.print("Preorder: ");
        root.preOrder();
        System.out.println();
        System.out.print("Interorder: ");
        root.interOrder();
        System.out.println();
    }

}
