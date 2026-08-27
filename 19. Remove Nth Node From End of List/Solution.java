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
    public ListNode removeNthFromEnd(ListNode head, int n) {
                ListNode pointer=head;
int size=0;
        while(pointer!=null){
            size++;
            pointer=pointer.next;
        }
        System.out.println("size: "+size);
        int index=size-n;
        System.out.println("index from start: "+index);
        
        if(index==0 && size==1){
            //remove first node
            head=null;
            return head;
        }else if(index==0){
            head=head.next;
            return head;
        }
        ListNode prev=head;
        pointer=head;

        for(int i=0;i<index;i++){
            prev=pointer;
            pointer=pointer.next;
        }
        prev.next=pointer.next;

        return head;
        
    }
}