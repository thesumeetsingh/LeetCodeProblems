class Solution {
    
    public int calPath(List<List<Integer>> triangle,  int level, int idx, Integer[][] dp){
        if(level==triangle.size()-1){
            return triangle.get(level).get(idx);
        }
        if(dp[level][idx] != null) {
            return dp[level][idx];
        }

        int downLeft= calPath(triangle, level+1, idx, dp);
        int downRight= calPath(triangle, level+1, idx+1, dp);

        dp[level][idx]= Math.min(downLeft, downRight)+triangle.get(level).get(idx);

        return dp[level][idx];

    }
    public int minimumTotal(List<List<Integer>> triangle) {
        Integer dp[][]= new Integer[triangle.size()][triangle.size()];
        return calPath(triangle, 0 ,0, dp);
    }
}