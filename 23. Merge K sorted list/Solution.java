class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {


        int k=lists.length;
        ListNode pointers[]=new ListNode[k];
        for(int i=0;i<lists.length;i++){
            pointers[i]=lists[i];
        }

        ListNode dummy=new ListNode(0);
        int flag=k;
       
       ListNode curr=dummy;
    
       int min=Integer.MAX_VALUE;
        int minIdx=0;
        for(int i=0;i<k;i++){
            if(lists[i]==null){
                flag--;
            }
        }
        if(flag==0){
            return dummy.next;
        }
    
        while(flag>0){
            min=Integer.MAX_VALUE;
            minIdx=0;
            for(int i=0;i<k;i++){
                if(pointers[i]!=null && min>=pointers[i].val){
                    min=pointers[i].val;          
                    minIdx=i;
                }
            }
            curr.next=pointers[minIdx];
            curr=curr.next;
            pointers[minIdx]=pointers[minIdx].next;
            if(pointers[minIdx]==null){
                flag--;
            }
        }

        return dummy.next;
    }
}