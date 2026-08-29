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
class Solution {
    public ListNode swapPairs(ListNode head) {

        if(head==null){  //list is empty
            return head;
        }
 

        ListNode first=head;
   
        if(first==null){      //list has only one element
            return head;
        }
        if(head.next==null){
            return head;
        }

        ListNode dummy=new ListNode(0);
        dummy.next = head;
        head=first.next;
        ListNode second=first.next;
        ListNode prev=dummy;   

        while(prev.next!=null && prev.next.next!=null){
            first.next=second.next;
            second.next=first;
            prev.next=second;

            //rearrange pointers
            
            prev=first;
            if(prev.next!=null && prev.next.next!=null){
                first=prev.next;
                second=first.next;

            }
        }

        return head;
        
    }
}