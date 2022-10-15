package HW;

public class MyLinkedListHwDemo {
    static void showArray(Object[] nums){
        System.out.print("[");
        for(int i=0; i<nums.length-1; i++)
            System.out.print(nums[i] + ",");
        if(nums.length>0)
            System.out.print(nums[nums.length-1]);
        System.out.println("]");
    }
    public static void main(String[] args) {

        MyLinkedListHw<Integer> mynums1 = new MyLinkedListHw<Integer>(new Integer[] {1, 2, 3, 4, 5});
        mynums1.printLinkedList(); // printLinkedList(5): 1 2 3 4 5

		// testing get()
		System.out.println(mynums1.get(0));	// 1
		System.out.println(mynums1.get(1));	// 2
		System.out.println(mynums1.get(4)); // 5

		// testing set(idx,val)
		mynums1.set(1,10); mynums1.printLinkedList(); // printLinkedList(5): 1 10 3 4 5
		mynums1.set(4,20); mynums1.printLinkedList(); // printLinkedList(5): 1 10 3 4 20
		mynums1.set(0,50); mynums1.printLinkedList(); // printLinkedList(5): 50 10 3 4 20

		// testing addAt(idx,val)
		mynums1.addAt(5,300); mynums1.printLinkedList(); // printLinkedList(6): 50 10 3 4 20 300
		mynums1.addAt(5,100); mynums1.printLinkedList(); // printLinkedList(7): 50 10 3 4 20 100 300
		mynums1.addAt(0,200); mynums1.printLinkedList(); // printLinkedList(8): 200 50 10 3 4 20 100 300

		// testing toArray()
		showArray(mynums1.toArray()); // [200,50,10,3,4,20,100,300]

        // testing clone()
        MyLinkedListHw<Integer> cloned = mynums1.clone();
        cloned.printLinkedList(); // printLinkedList(8): 200 50 10 3 4 20 100 300
        cloned.set(0,-1); cloned.set(3, -11); cloned.remove(10);
        cloned.printLinkedList(); // printLinkedList(7): -1 50 -11 4 20 100 300
        mynums1.printLinkedList(); // printLinkedList(8): 200 50 10 3 4 20 100 300

		// testing removeAll()
		MyLinkedListHw<Integer> mynums2 = new MyLinkedListHw<Integer>(new Integer[] {1, 1, 2, 2, 2, 3, 1, 2, 3, 2, 2});
		mynums2.printLinkedList(); // printLinkedList(11): 1 1 2 2 2 3 1 2 3 2 2
		mynums2.removeAll(2); mynums2.printLinkedList(); // printLinkedList(5): 1 1 3 1 3
		mynums2.removeAll(1); mynums2.printLinkedList(); // printLinkedList(2): 3 3
		mynums2.removeAll(3); mynums2.printLinkedList(); // printLinkedList(0):
    }
}