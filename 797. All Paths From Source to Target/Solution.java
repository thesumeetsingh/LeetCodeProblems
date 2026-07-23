import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> result= new ArrayList<>();
    public void allpath(int[][] graph, int curr, int target, ArrayList<Integer> path, boolean visited[]){
        if(curr==target){
            path.add(curr);
            result.add(new ArrayList(path));
            path.remove(path.size()-1);
            return;
        }
        if(visited[curr]==true){
            return;
        }

        path.add(curr);
        visited[curr]=true;
        for(int i=0;i<graph[curr].length;i++){
            if(visited[graph[curr][i]]==false){

                allpath(graph, graph[curr][i], target, new ArrayList(path), visited);
                
            }
            
        }
        visited[curr]=false;
        
            
        
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ArrayList<Integer> path= new ArrayList<>();

        boolean visited[]= new boolean[graph.length];

        allpath(graph, 0, graph.length-1, path, visited);

        return result;
    }
}