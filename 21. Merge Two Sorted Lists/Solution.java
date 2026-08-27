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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode head=new ListNode(0);
       ListNode pointer=head;
        int curr=0;
       while(list1!=null && list2!=null){
        if(list1.val<list2.val){
            curr=list1.val;
            list1=list1.next;
        }else{
            curr=list2.val;
            list2=list2.next;
        }

        pointer.next=new ListNode(curr);
        pointer=pointer.next;

       } 

       if(list1!=null){
        while(list1!=null){
            curr=list1.val;
            list1=list1.next;
            pointer.next=new ListNode(curr);
            pointer=pointer.next;
        }
       }else if(list2!=null){
        while(list2!=null){
            curr=list2.val;
            list2=list2.next;
            pointer.next=new ListNode(curr);
            pointer=pointer.next;
        }
       }

       return head.next;
    }
}