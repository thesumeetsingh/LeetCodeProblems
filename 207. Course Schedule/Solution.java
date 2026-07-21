class Solution {

    public boolean detectCycle(int[][] prerequisites, int curr, boolean[] visited, boolean[] rec, int n){
        if(rec[curr]){
            return true;
        }
        if(visited[curr]){
            return false;
        }

        rec[curr]=true;
        visited[curr]=true;
        for(int i=0;i<prerequisites.length;i++){
            if(prerequisites[i][0]==curr){
                if(detectCycle(prerequisites, prerequisites[i][1], visited, rec, n)){
                    return true;
                }
            }
        }
        rec[curr]=false;

        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean visited[]= new boolean[numCourses];
        boolean rec[]= new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if(detectCycle(prerequisites, i, visited, rec, numCourses)){
                    return false;
                }
            }
        }

        return true;
    }
}