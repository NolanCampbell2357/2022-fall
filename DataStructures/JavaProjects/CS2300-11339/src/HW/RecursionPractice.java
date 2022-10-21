/**
 * Nolan Campbell
 * RecursionPractive.java
 */

package HW;

public class RecursionPractice {
	public static void printAlphabetsHelper(char ch)
	{
		System.out.print(ch);
		if(ch == 'Z') {
			return;
		}

		printAlphabetsHelper((char)(ch + 1));
	}

	public static void printAlphabets()
	{
		// This is complete. Nothing to do in this function.
		// this is a wrapper function that simply rely on recursive function printAlphabetHelper(ch)
		// This prints "ABCDEFGHIJKLMNOPQRSTUVWXYZ" one character after another.
		printAlphabetsHelper('A');
	}

	public static boolean isLarger(int a, int b)
	{
		// Assume both a and b are non-negative integers.
		// NOT ALLOWED TO USE '<' or '>' operators, only '==' is allowed. Use recursion
		// if a is larger, then returns true
		// Or (including equal), returns false

		if (a == b+1) {
			return true;
		} else if(a == -1) {
			return false;
		}

		return isLarger(a-1, b);	// change this as needed
	}

	public static void printPrimeFactorsHelper(int n, int divisor)
	{
		// if n is divided by divisor, then print divisor 
		//		and recursive call with (n/divisor, divisor)
		// if n is not divided by divisor, recursive call with (n, divisor+1)
		// stop when n is too small 
		
		if (n == 1) {
			return;
		}

		if(n % divisor == 0) {
			System.out.print(divisor + " ");
			printPrimeFactorsHelper(n/divisor, divisor);
		} else {
			printPrimeFactorsHelper(n, divisor+1);
		}
	}

	public static void printPrimeFactors(int n)
	{
		// This is complete. Nothing to do in this function.
		// This prints prime factors of n. 
		// eg) printPrimeFactors(60) will print 2 2 3 5
		printPrimeFactorsHelper(n, 2);
		System.out.println();
	} 

	public static int sumAll(SLLNode<Integer> node) 
	{ 
		// sum all values in the list
		// eg) List 10,-5,10,20 --> sumAll() returns 35.  
		/**********************
		Code goes here.
		**********************/
		return (node == null ? 0 : node.info + sumAll(node.next));
	}

	public static int findMax(SLLNode<Integer> node)
	{
		// returns the maximum value in the linked list
		
		if(node.next == null) {
			return node.info;
		}

		int num = findMax(node.next);
		if(node.info > num) {
			return node.info;
		} else {
			return num;
		}
	}

	public static void printLinkedListReverse(SLLNode<Integer> node)
	{
		// print the linked list contents in reverse order.
		// For example of a list A-->B-->C
		// this prints "C B A"
		

		if(node == null) {
			return;
		}
		printLinkedListReverse(node.next);
		System.out.print(node.info + " ");
	}

	public static boolean subsetSum(SLLNode<Integer> node, int target)
	{
		// returns true if any of subset of numbers[] sum to target
		// For example, The list is {2,3,5,7,11}, target=12
		// a subset {5,7} sums to 12. 
		// Another subset {2,3,7} sums to 12 too.
		// If no such subset exist, it returns false.
		

		if(target == 0) {
			return true;
		}

		if(node == null || target < 0) {
			return false;
		}

		return subsetSum(node.next, target) || subsetSum(node.next, target-node.info);
	}

	public static SLLNode<Integer> remove(SLLNode<Integer> node, int val)
	{
		// remove the first instance of 'val'
		// eg) List 10,-5,10,20,10,4 --> -5,10,20,10,4 after remove()  

		// return if the given list is null
		// if node has info equal to val, skip this node and return whatever is returned from its recursive call
		// if node has info NOT equal to val, return this node with its connection to whatever is returned from its recursive call 


		if(node == null) {
			return null;
		}

		if(node.info == val) {
			return node.next;
		}

		node.next = remove(node.next, val);
		return node; // change this as needed
	}
	
	public static SLLNode<Integer> removeAll(SLLNode<Integer> node, int val) 
	{ // requirement: worst-case time complexity O(N) while N is the number elements in the list
		
		// similar to remove() above.
		// remove all instances of 'val'
		// eg) List 10,-5,10,20,10,4 --> -5,20,4 after removeAll()  

		if(node == null) {
			return null;
		}

		if(node.info == val) {
			return removeAll(node.next, val);
		}

		node.next = removeAll(node.next, val);
		return node; // change this as needed
	}
	
	// Following functions are here just to help testing
	static SLLNode<Integer> buildLinkedList(int[] nums) { // O(nums.length)
		SLLNode<Integer> head = null;
		for(int i=nums.length-1;i>=0;i--) {
			SLLNode<Integer> newNode = new SLLNode<Integer>(nums[i]);
			newNode.next = head;
			head = newNode;
		}
		return head;
	}
	static void printLinkedList(SLLNode<Integer> node) { // O(numElements)
		System.out.print("printLinkedList(): ");
		while( node != null) {
			System.out.print(node.info + " ");
			node = node.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printAlphabets();
		System.out.println();
		System.out.println(isLarger(10,11)); // false
		System.out.println(isLarger(11,11)); // false
		System.out.println(isLarger(12,11)); // true
		System.out.println(isLarger(33,11)); // true
		System.out.println(isLarger(1,0)); // true
		System.out.println(isLarger(1,1)); // false

		printPrimeFactors(2*2*3*11*13*17);
		printPrimeFactors(2*2*2*3*5*7);
		printPrimeFactors(2*2*2*2*5*5*5*7*7*11);
		
		SLLNode<Integer> ls = buildLinkedList(new int[] {10,-5,10,20,10});
		System.out.println("The total sum is "+sumAll(ls));
		System.out.println("The Max number is "+findMax(ls));
		printLinkedListReverse(ls);
		System.out.println(subsetSum(buildLinkedList(new int[]{2,3,5,7,11}), 12));
		//
		ls = remove(ls, 10); System.out.print("List is ..."); printLinkedList(ls);
		ls = removeAll(ls, 10);	System.out.print("List is ..."); printLinkedList(ls);

		SLLNode<Integer> ls2 = buildLinkedList(new int[] {15, 25, 25, -10, 30, 10,-5,10,20, 0, 10, 15});
		System.out.println("The total sum is "+sumAll(ls2));
		System.out.println("The Max number is "+findMax(ls2));
		printLinkedListReverse(ls2);
		//

		ls2 = removeAll(ls2, 15);	System.out.print("List is ..."); printLinkedList(ls2);
		ls2 = remove(ls2, 10); System.out.print("List is ..."); printLinkedList(ls2);
		ls2 = remove(ls2, 20); System.out.print("List is ..."); printLinkedList(ls2);
		ls2 = removeAll(ls2, 25); System.out.print("List is ..."); printLinkedList(ls2);
		ls2 = removeAll(ls2, 10);	System.out.print("List is ..."); printLinkedList(ls2);

		System.out.println("Subset sums");
		System.out.println(subsetSum(buildLinkedList(new int[]{2,3}), 12)); // False
		System.out.println(subsetSum(buildLinkedList(new int[]{11}), 12)); // False
		System.out.println(subsetSum(buildLinkedList(new int[]{5, 8}), 12)); // False
		System.out.println(subsetSum(buildLinkedList(new int[]{6, 5, 11, 13, 10, 9, 8}), 12)); // False
		System.out.println(subsetSum(buildLinkedList(new int[]{6, 5, 1, 11}), 12)); // True
	}
}