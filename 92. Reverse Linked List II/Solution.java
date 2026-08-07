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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        

        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode L=head;
        ListNode nextL=head.next;
        ListNode preL=dummy;
        ListNode R=head;
        ListNode nextR=head.next;;
        ListNode preR=dummy;

        //assign left and righ pointers 
        for(int i=1;i<left;i++){
            preL=preL.next;
            L=L.next;
            nextL=nextL.next;
        }
        for(int i=1;i<right;i++){
            preR=preR.next;
            R=R.next;
            nextR=nextR.next;
        }
        ListNode temp=head;
        while(left<right){
            if(nextL==R){
                L.next=nextR;
                preL.next=R;
                R.next=L;

                break;
            }
            preL.next=R;
            R.next=nextL;
            preR.next=L;
            L.next=nextR;

            preL=R;
            R=preR;
            nextR=L;
            L=nextL;
            nextL=L.next;

            temp=L;
            while(temp!=null && temp.next!=R){
                temp=temp.next;
            }
            preR=temp;

            left++;
            right--;
        }
        return dummy.next;

    }
}