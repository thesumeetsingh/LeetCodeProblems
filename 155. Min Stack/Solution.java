class MinStack {
    class Node{
        int val;
        int minTillThisNode;
        Node next;

        Node(int val){
            this.val=val;
            this.next=null;

        }
    }
    public MinStack() {

    }

    Node head=null;
    private int size=0;
    
    public void push(int val) {
        Node currNode=new Node(val);
        if(head==null){
            head=currNode;
            currNode.minTillThisNode=val;
        }else{
            currNode.next=head;
            if(head.minTillThisNode<val){
                currNode.minTillThisNode=head.minTillThisNode;
            }else{
                currNode.minTillThisNode=val;
            }
            head=currNode;
        }
    }
    
    public void pop() {
        if(head==null){
            return;
        }if(head.next==null){
            head=null;
            return;
        }
        head=head.next;
    }
    
    public int top() {
        if(head==null){
            return -1;
        }
        return head.val;
    }
    
    public int getMin() {
        if(head==null){
            return -1;
        }
        return head.minTillThisNode;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */