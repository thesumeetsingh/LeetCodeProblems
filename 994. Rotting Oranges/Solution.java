import java.util.*;



class Solution {
    public int time=0;

    public void bfs(int[][] grid){
        Queue<ArrayList<Integer>> q= new LinkedList<>();
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    ArrayList<Integer> coord= new ArrayList<>();
                    coord.add(i);
                    coord.add(j);
                    q.add(coord);
                }
            }
        }
        q.add(null);

        while(!q.isEmpty()){
            ArrayList<Integer> current= q.remove();
            if(current==null){
                if(q.isEmpty()){
                    return;
                }else{
                    time++;
                    q.add(null);
                }
            }else{
                if(grid[current.get(0)][current.get(1)]==1){
                    
                    grid[current.get(0)][current.get(1)]=2;

                }
                int row=current.get(0);
                int col=current.get(1);
                if(row>0 && grid[row-1][col]==1){
                    ArrayList<Integer> up= new ArrayList<>();
                    up.add(row-1);
                    up.add(col);
                    q.add(up);
                    grid[row-1][col]=2;
                }
                if(row<grid.length-1 && grid[row+1][col]==1){
                    ArrayList<Integer> down= new ArrayList<>();
                    down.add(row+1);
                    down.add(col);
                    q.add(down);
                    grid[row+1][col]=2;
                }
                if(col<grid[0].length-1 && grid[row][col+1]==1){
                    ArrayList<Integer> right= new ArrayList<>();
                    right.add(row);
                    right.add(col+1);
                    q.add(right);
                    grid[row][col+1]=2;
                }
                if(col>0 && grid[row][col-1]==1){
                    ArrayList<Integer> left= new ArrayList<>();
                    left.add(row);
                    left.add(col-1);
                    q.add(left);
                    grid[row][col-1]=2;                    
                }
            }
        }
    }

    public int orangesRotting(int[][] grid) {
        bfs(grid);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return time;
    }
}