/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class _143ReorderList {
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        if (head == null || head.next==null || head.next.next==null) {
            return;
        }

        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode rightHead = slow.next;
        slow.next = null;

        //reverse Left Half;

        ListNode prev = rightHead;
        ListNode curr = rightHead.next;
        ListNode post=curr;
        if(curr!=null){
            post = curr.next;
        }
       
        prev.next=null;
        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = post;
            if (post != null) {
                post = post.next;
            }
        }

        ListNode right=prev;
        ListNode left = head;
        ListNode rightNext = right.next;
        ListNode leftNext = left.next;
        while (right != null && left != null) {
            left.next = right;
            right.next = leftNext;
            left = leftNext;
            right = rightNext;
            if (leftNext != null) {
                leftNext = leftNext.next;
            }
            if (rightNext != null) {

                rightNext = rightNext.next;
            }

        }
        if(right!=null){

        }

      
    }
}
}