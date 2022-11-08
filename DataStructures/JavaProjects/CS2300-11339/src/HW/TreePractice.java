package HW;

import java.util.LinkedList;
import java.util.Queue;

public class TreePractice {
    static void PreOrder(BSTNode<Integer> node){
        if(node == null)
            return;
        System.out.print(node.info + " ");
        PreOrder(node.left);
        PreOrder(node.right);
    }
    static void InOrder(BSTNode<Integer> node){
        if(node == null)
            return;
        InOrder(node.left);
        System.out.print(node.info + " ");
        InOrder(node.right);
    }
    static void traverseTree(BSTNode<Integer> node){
        System.out.print("PreOrder: ");
        PreOrder(node);
        System.out.print(", ");
        System.out.print("InOrder: ");
        InOrder(node);
        System.out.println();
    }
    static BSTNode<Integer> BSTadd(BSTNode<Integer> node, int val){
        if(node == null)
            return new BSTNode<Integer>(val);
        if(val <= node.info)
            node.left = BSTadd(node.left, val);
        else
            node.right = BSTadd(node.right, val);
        return node;
    }
    static BSTNode<Integer> buildBST(int[] nums){
        BSTNode<Integer> root = null;
        for(int i=0; i<nums.length;i++)
            root = BSTadd(root, nums[i]);
        return root;
    }

    //
    // HERE COME YOUR WORK TO DO
    //
    static int size(BSTNode<Integer> node) {
        // Return the number of nodes in the tree.
        if(node == null) {
            return 0;
        }

        return 1 + size(node.left) + size(node.right); 
    }

    static int height(BSTNode<Integer> node){
        // Return the height of the tree. Note that height is 0 for a empty tree and a tree with one node.

        if(node == null) {
            return 0;
        }

        if(node.left == null && node.right == null) {
            return 0;
        }

        return 1 + Math.max(height(node.left), height(node.right));
    }

    static void plusOne(BSTNode<Integer> node){
        // Make changes to the tree so that all numbers in the tree increase by one.
        if(node == null) {
            return;
        }
        node.info++;
        plusOne(node.left);
        plusOne(node.right);
    }

    static BSTNode<Integer> copyTree(BSTNode<Integer> node){
        // Return a new binary tree that is an exact copy of the given tree.
        // Each node should be copied so that any change that happens on one tree is not visible to the other.

        if(node == null) {
            return null;
        }

        BSTNode<Integer> newNode = new BSTNode<Integer>(node.info);
        newNode.left = copyTree(node.left);
        newNode.right = copyTree(node.right);

        return newNode; 
    }

    static void flipLeftRight(BSTNode<Integer> node){
        // Make changes to the tree so that every node has its left and right subtree swapped.
        if(node == null) {
            return;
        }

        Queue<BSTNode<Integer>> queue = new LinkedList<BSTNode<Integer>>();
        queue.add(node);

        while(!queue.isEmpty()) {
            BSTNode<Integer> current = queue.poll();
            BSTNode<Integer> temp = current.left;
            current.left = current.right;
            current.right = temp;

            if(current.left != null) {
                queue.add(current.left);
            }

            if(current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        BSTNode<Integer> tr1 = buildBST(new int[]{40, 20, 60, 10, 30, 15});

        System.out.println("Testing size()");
        System.out.println(size(null)); // 0
        System.out.println(size(new BSTNode<Integer>(10))); // 1
        System.out.println(size(buildBST(new int[]{40, 20, 60, 10}))); // 4
        System.out.println(size(tr1)); // 6

        System.out.println("Testing height()");
        System.out.println(height(null)); // 0
        System.out.println(height(new BSTNode<Integer>(10))); // 0
        System.out.println(height(buildBST(new int[]{40, 20}))); // 2
        System.out.println(height(buildBST(new int[]{40, 20, 60, 10}))); // 2
        System.out.println(height(tr1)); // 3

        System.out.println("Testing plusOne()");
        traverseTree(tr1); // PreOrder: 40 20 10 15 30 60 , InOrder: 10 15 20 30 40 60
        plusOne(tr1);
        traverseTree(tr1); // PreOrder: 41 21 11 16 31 61 , InOrder: 11 16 21 31 41 61

        System.out.println("Testing copyTree()");
        BSTNode<Integer> tr2 = copyTree(tr1);
        tr2.info = 45; tr2.left.info = 19;
        traverseTree(tr1); // PreOrder: 41 21 11 16 31 61 , InOrder: 11 16 21 31 41 61
        traverseTree(tr2); // PreOrder: 45 19 11 16 31 61 , InOrder: 11 16 19 31 45 61

        System.out.println("Testing flipLeftRight()");
        flipLeftRight(tr1);
        traverseTree(tr1); // PreOrder: 41 61 21 31 11 16 , InOrder: 61 41 31 21 16 11
    }
}