package addtwonumbers;

import java.util.HashMap;
import java.util.Map;


public class MySolution {

	public static void main(String[] args) {

		MySolution ms = new MySolution();
		// ms.addTwoNumbers(l1, l2)
//		[8,2,1,3,0,4,0,1]
//		[3,4,9,4,5,2,6,9,4,1]
//		ListNode l1 = new ListNode(8);
//		l1.next = new ListNode(2);
//		l1.next.next = new ListNode(1);
//		l1.next.next.next = new ListNode(3);
//		l1.next.next.next.next = new ListNode(0);
//		l1.next.next.next.next.next = new ListNode(4);
//		l1.next.next.next.next.next.next = new ListNode(0);
//		l1.next.next.next.next.next.next.next = new ListNode(1);
//		
//		ListNode l2 = new ListNode(3);
//		l2.next = new ListNode(4);
//		l2.next.next = new ListNode(9);
//		l2.next.next.next = new ListNode(4);
//		l2.next.next.next.next = new ListNode(5);
//		l2.next.next.next.next.next = new ListNode(2);
//		l2.next.next.next.next.next.next = new ListNode(6);
//		l2.next.next.next.next.next.next.next = new ListNode(9);
//		l2.next.next.next.next.next.next.next.next = new ListNode(4);
//		l2.next.next.next.next.next.next.next.next.next = new ListNode(1);
		ListNode l1 = new ListNode(1);
		
		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);
		l2.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
		
		ListNode result = ms.addTwoNumbers(l2, l1);
		System.out.println(ms.get(0, result).val);
		System.out.println(ms.get(1, result).val);
		System.out.println(ms.get(2, result).val);
		System.out.println(ms.get(3, result).val);
		System.out.println(ms.get(4, result).val);
		System.out.println(ms.get(5, result).val);
		System.out.println(ms.get(6, result).val);
		System.out.println(ms.get(8, result).val);
		System.out.println(ms.get(9, result).val);
		System.out.println(ms.get(10, result).val);
//		System.out.println(ms.get(7, result).val);
//		System.out.println(ms.get(7, result).val);


		
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode r1 = l1;
		while (l1.next != null && l2.next != null) {
			l1.val += l2.val;
			if (l1.val >= 10) {
				l1.val -= 10;
				l1.next.val += 1;
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		l1.val += l2.val;
		if (l1.next == null && l2.next == null) {
			if (l1.val >= 10) {
				l1.val -= 10;
				l1.next = new ListNode(1);
			}
			return r1;
		} else {
			if (l2.next != null) {
				l1.next = l2.next;
			}
			if (l1.val >= 10) {
				l1.val -= 10;
				l1.next.val += 1;
			}
			l1 = l1.next;
			while (l1.next != null) {
				if (l1.val >= 10) {
					l1.val -= 10;
					l1.next.val += 1;
				}
				l1 = l1.next;
			}
			if (l1.val >= 10) {
				l1.val -= 10;
				l1.next = new ListNode(1);
			}
			return r1;
		}
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	public ListNode get(int i, ListNode l) {
		ListNode current = l;
		for (int j = 0; j < i; j++) {
			current = current.next;
		}
		return current;
	}

}
