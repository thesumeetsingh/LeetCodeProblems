class Solution {
    public int islands=0;
    public boolean[] moves(char[][] grid, int row, int col){   
        boolean[] validMoves= new boolean[4];
        //up, right, down, left
        if(row>0) validMoves[0]=true; //move up
        if(col<grid[0].length-1) validMoves[1]=true; //move right
        
        if(row<grid.length-1) validMoves[2]=true; //move down
        if(col>0) validMoves[3]=true; //move left

        return validMoves;
    }

    public void dfs(char[][] grid, boolean[][] vis,int row, int col){
        if((row>=grid.length || row<0 || col<0 || col>=grid[0].length) || grid[row][col]=='0'){
            return;
        }
        else{
            if(!vis[row][col]){
               
                vis[row][col]=true;
                int r=row, c=col;
                boolean myMoves[]= moves(grid, row, col);
                for(int i=0;i<4;i++){
                    r=row;
                    c=col;
                    if(myMoves[i]){
                        if(i==0){
                            r=row-1;
                            dfs(grid, vis, r,c);
                        }  //up;
                        else if(i==1) {
                            c=col+1;
                            dfs(grid, vis, r,c); //right
                        }else if(i==2){
                            r=row+1; //down
                            dfs(grid, vis, r,c);
                        }else {
                            c=col-1;
                            dfs(grid, vis, r,c); //left
                        }
                    }
                }
                return;
            }else{
                return;
            }
        }

    }
    public int numIslands(char[][] grid) {
        boolean vis[][]= new boolean[grid.length][grid[0].length];
        // int parent[]={0,0};
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='1' && !vis[i][j]){
            islands++;
            dfs(grid, vis, i, j);
        }
            }
        }

        return islands;

    }
}