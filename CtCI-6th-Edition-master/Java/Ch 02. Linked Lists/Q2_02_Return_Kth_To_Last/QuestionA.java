package Q2_02_Return_Kth_To_Last;

import CtCILibrary.*;

public class QuestionA {

	public static int printKthToLast(LinkedListNode head, int k) {
		if (head == null) {
			return 0;
		}
		int index = printKthToLast(head.next, k) + 1;
		if (index == k) {
			System.out.println(k + "th to last node is " + head.data);
		}
		return index;
	}
	
	
	public static int printKth(LinkedListNode head, int k) {
		if(head==null) return 0;
		
		int length = 0;
		
		LinkedListNode node = head;
		
		while(node.next!=null) {
			length++;
			node = node.next;
		}
		
		int iterate = length - k;
		
		while(iterate>0) {
			head = head.next;
			iterate--;
		}
		
		return head.data;
	}
	
	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3, 4, 5, 6};
		LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);
		for (int i = 0; i <= array.length + 1; i++) {
//			printKthToLast(head, i);
			System.out.println(printKth(head, i));
			}
	}

}
