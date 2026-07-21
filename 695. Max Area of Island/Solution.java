class Solution {
    public int dfs(int row, int col, int[][] grid, boolean[][] visited){

        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length){
            return 0;
        }

        if(visited[row][col] || grid[row][col]==0){
            return 0;
        }

        visited[row][col]=true;
        int left=0, right=0, up=0, down=0;
        if(row>0){
            up=dfs(row-1, col, grid,  visited);
        }
        if(row<grid.length-1){
            down=dfs(row+1, col, grid, visited);
        }
        if(col>0){
            left=dfs(row, col-1, grid, visited);
        }
        if(col<grid[0].length-1){
            right=dfs(row, col+1, grid,  visited);
        }

        return left+right+up+down+1;


    }
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0;
        boolean visited[][]= new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    int curr=dfs(i,j, grid, visited);
                    if(curr>maxArea){
                        maxArea=curr;
                    }
                    
                }
            }
        }

        return maxArea;
    }
}