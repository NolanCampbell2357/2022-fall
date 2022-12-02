package Exam;

public class ListDemo {
    public static SLLNode<Integer> list(int[] nums){
        SLLNode<Integer> ls = null;
        for(int i=nums.length-1; i>=0;i--) {
            SLLNode<Integer> newNode = new SLLNode<Integer>(nums[i]);
            newNode.next = ls;
            ls = newNode;
        }
        return ls;
    }
    public static void printLinkedList(SLLNode<Integer> node){
        while(node != null) {
            System.out.print(node.info+" ");
            node = node.next;
        }
        System.out.println();
    }

    public static SLLNode<Integer> mergeIfLessThan(SLLNode<Integer> node, int val){
        return mergeIfLessThan(node, val, 0);
    }
    public static SLLNode<Integer> mergeIfLessThan(SLLNode<Integer> node, int val, int sum){
        // Use RECURSION !!!

        // If the list is empty, return null
        if(node == null) {
            return null;
        }

        // If the list has only one node left (nothing to merge), return a copy of the node
        if(node.next == null) {
            SLLNode<Integer> newNode = new SLLNode<Integer>(node.info);
            return newNode;
        }
        // add node.info to 'sum'
        // If 'sum' is equal to or greater than 'val',
        //      create a new node nodes with its value equal to 'sum'
        //      connect the new node to the remaining merged list (recursion with 'sum' as 0)
        //      return the new node
        // Else (less than 'val')
        //      return the remaining merged list (recursion with added 'sum')

        sum+=node.info;
        if(sum >= val) {
            SLLNode<Integer> nodes = new SLLNode<Integer>(sum);
            nodes.next = mergeIfLessThan(node.next, val, 0);
            return nodes;
        } else {
            return mergeIfLessThan(node.next, val, sum);
        }
    }
    public static void main(String[] args) {
        printLinkedList(mergeIfLessThan(list(new int[] {}), 10)); // (empty line)
        printLinkedList(mergeIfLessThan(list(new int[] {5}), 10)); // 5
        printLinkedList(mergeIfLessThan(list(new int[] {2,4,5,6}), 10)); // 11 6
        SLLNode<Integer> ls1 = list(new int[] {2,3,4,5,6});
        printLinkedList(mergeIfLessThan(ls1, 5)); // 5 9 6
        printLinkedList(ls1); // 2 3 4 5 6
    }
}