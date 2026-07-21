class Solution {

    public boolean findPath(int u, int v, int[][] edges, boolean visited[], int currentEdge){
        if(visited[u-1]){
            return false;
        }
        if(u==v){
            return true;
        }
        else{
            visited[u-1]=true;
            boolean reachable=false;
            for(int i=0;i<=currentEdge;i++){
                boolean curr=false;
                if(edges[i][0]==u){
                    curr=findPath(edges[i][1], v, edges, visited, currentEdge);
                    
                }else if(edges[i][1]==u){
                    curr=findPath(edges[i][0], v, edges, visited, currentEdge);
                    
                }
                reachable=reachable||curr;
            }

            return reachable;
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int result[]= new int[2];
        int nodes=0;
        for(int i=0;i<edges.length;i++){
            if(edges[i][0]>nodes){
                nodes=edges[i][0];
            }if(edges[i][1]>nodes){
                nodes=edges[i][1];
            }
        }


        for(int i=0;i<edges.length;i++){
            boolean visited[]= new boolean[nodes];
            boolean check= findPath(edges[i][0], edges[i][1],edges, visited, i-1);

            if(check){
                result[0]=edges[i][0];
                result[1]=edges[i][1];
                return result;
            }
        }

        return result;

    }
}