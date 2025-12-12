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
class _148SortList {

    class ListNode{
        int val;
        ListNode next;

        ListNode(){

        }
        ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public static void MergeSort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        MergeSort(arr, si, mid );
        MergeSort(arr,mid+1, ei );
        Merge(arr, si, mid, ei);
    }

    public static void Merge(int arr[], int si,int mid,int ei){
        int temp[]=new int[ei-si+1];

        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(i=si, k=0;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }
    public ListNode sortList(ListNode head) {
        

        ListNode ptr=head;
        int size=0;
        while(ptr!=null){
            ptr=ptr.next;
            size++;
        }

        ptr=head;
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=ptr.val;
            ptr=ptr.next;
        }

        MergeSort(arr, 0, arr.length-1);

        ptr=head;
        for(int i=0;i<arr.length;i++){
            ptr.val=arr[i];
            ptr=ptr.next;
        }

        return head;
    }
}