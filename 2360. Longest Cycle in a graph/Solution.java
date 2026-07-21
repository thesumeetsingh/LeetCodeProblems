class Solution {
    public int max=-1;
    class NodeInfo{
        boolean cycle;
        int val;
        int myLength;
        boolean detected;

        NodeInfo(){
            this.cycle=false;
            this.val=-1;
            this.myLength=0;
            this.detected=false;
        }

        NodeInfo(boolean cycle, int val, int myLength, boolean detected){
            this.cycle=cycle;
            this.val=val;
            this.myLength=myLength;
            this.detected=detected;
        }
    }

    public NodeInfo detectCycle(int[] edges, boolean[] visited, boolean[] rec, int curr){
        if(curr==-1){
            return new NodeInfo();
        }
        if(curr==edges[curr]){
            return new NodeInfo(true, curr, 1, true);
        }
        if(rec[curr]){
            NodeInfo mine= new NodeInfo(true, curr, 0, false);
            return mine;
        }
        if(visited[curr]){
            return new NodeInfo();
        }
        
        visited[curr]=true;
        rec[curr]=true;
        NodeInfo check=detectCycle(edges, visited, rec, edges[curr]);
        rec[curr]=false;
        NodeInfo mine= new NodeInfo();

        if(!check.detected && check.cycle){
            mine.myLength=check.myLength+1;
            mine.cycle=true;
            mine.val=check.val;
            
        }
        if(check.val==curr){
            if(max<mine.myLength){
                max=mine.myLength;
            }
            mine.detected=true;
        }

        return mine;
    }

    public int longestCycle(int[] edges) {
        boolean visited[]= new boolean[edges.length];
        boolean rec[]= new boolean[edges.length];

        for(int i=0;i<edges.length;i++){
            if(!visited[i]){
                detectCycle(edges, visited, rec, i);
            }
        }

        return max;
    }
}