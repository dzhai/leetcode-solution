package com.github.dzhai.leetcode.algorithms;


//2. Add Two Numbers  两次反转
public class A002st {

	public static void main(String[] args) {
		A002st a=new A002st();
		
		ListNode l1=new ListNode(2);		
		ListNode next=new ListNode(4);
		l1.next=next;
		next=new ListNode(3);
		l1.next.next=next;
		
		
		ListNode l2=new ListNode(5);		
		next=new ListNode(6);
		l2.next=next;
		next=new ListNode(4);
		l2.next.next=next;
		ListNode result=a.addTwoNumbers(l1, l2);
		while(result!=null){
			System.out.println(result.val);
			result=result.next;
		}
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    ListNode dummyHead = new ListNode(0);
	    ListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
	}

}
