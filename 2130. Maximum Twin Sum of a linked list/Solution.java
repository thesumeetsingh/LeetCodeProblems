class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public int pairSum(ListNode head) {
        int size=0;
        ListNode pointer= head;
        while(pointer!=null){
            pointer=pointer.next;
            size++;            
        }

        size=size/2;
        pointer=head;
        while(size!=1){
            size--;
            pointer=pointer.next;

        }
        
        ListNode previous=pointer.next;
        pointer.next=null;
        ListNode curr=previous.next;
        ListNode future=null;

        if(curr!=null){
            future=curr.next;
        }else{
            future=curr;
        }
        
        previous.next=null;
        while(curr!=null){
            future=curr.next;
            curr.next=previous;
            previous=curr;
            curr=future;
        }

        int max=Integer.MIN_VALUE;
        pointer=head;
        while(pointer!=null){
            int sum=pointer.val+previous.val;
            if(sum>max)max=sum;
            pointer=pointer.next;
            previous=previous.next;
        }
        return max;
    }
}