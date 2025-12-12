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
public class _148SortList_Orderof1 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode mergeSort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode rightHead=slow.next;
        ListNode leftHead=head;
        slow.next=null;
        ListNode newLeft=mergeSort(leftHead);
        ListNode newRight=mergeSort(rightHead);
        return merge(newLeft, newRight);

    }

    public static ListNode merge(ListNode leftHead, ListNode rightHead){
        ListNode merged=new ListNode(0);
        ListNode temp=merged;

        while(leftHead!=null && rightHead!=null){
            if(leftHead.val<rightHead.val){
                temp.next=leftHead;
                leftHead=leftHead.next;
            }else{
                temp.next=rightHead;
                rightHead=rightHead.next;
            }
            temp=temp.next;
        }

        while(leftHead!=null){
                temp.next=leftHead;
                leftHead=leftHead.next;
                temp=temp.next;
        }
        while(rightHead!=null){
                temp.next=rightHead;
                rightHead=rightHead.next;
                temp=temp.next;
        }

        return merged.next;
    }
    public ListNode sortList(ListNode head) {
        ListNode slow=head;
        if(head==null){
            return head;
        }

        return mergeSort(head);

    }
}