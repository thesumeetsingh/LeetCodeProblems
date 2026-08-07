public class Solution {
    class Solution {
    int dp[][];
    
    public int travel(int[][] grid, int row, int col){
        if(row>=grid.length || row<0 || col>=grid[0].length || col<0){
            return Integer.MAX_VALUE;
        }

        if(row==grid.length-1 && col==grid[0].length-1){
            return grid[row][col];
        }

        if(dp[row][col]!=-1){
            return dp[row][col];
        }

        int right= travel(grid, row, col+1);
        int down= travel(grid, row+1, col);

        dp[row][col]= grid[row][col]+ Math.min(right, down);

        return dp[row][col];
    } 
    public int minPathSum(int[][] grid) {
        dp= new int[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                dp[i][j]=-1;
            }
        }

        return travel(grid, 0, 0);
        
    }
}
}
