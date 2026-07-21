class ListNode{
    
    ListNode next;
    int val;

    public ListNode(int val){
        this.val=val;
    }

}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode pointer=head;
        int size=0;

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode preBreak=dummy;
        ListNode Break=head;

        ListNode endPoint=dummy;
        while(pointer!=null){
            size++;
            endPoint=pointer;
            pointer=pointer.next;

        }


        int rotate=k%size;
        if(rotate==0){
            return head;
        }
        int breakPoint=size-rotate;
  
        for(int i=1;i<=breakPoint;i++){
            preBreak=preBreak.next;
            Break=Break.next;
  
        }

        endPoint.next=head;
        preBreak.next=null;

        return Break;

    }
}