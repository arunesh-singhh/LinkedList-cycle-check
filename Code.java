// FIRST APPROACH 
//since constraints for value are -10^5 <= Node.val <= 10^5
//then I use 1_000_000 as indicator that this node has been
//visited

public class Solution {
    public boolean hasCycle(ListNode head) {
        while (head != null) {
            if (head.val == 1_000_000) return true;
            head.val = 1_000_000;
            head = head.next;
        }
        return false;
    }
}


// SECOND APPROACH 
// Taken two pointer slow and fast .
// travers on LL from the beginning to end .
// And check slow==fast.
// if both are equal then it become cyclic LL, then return true else false.

// Time complexity: 0(n)
// Space complexity: constant time

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head ,fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}
