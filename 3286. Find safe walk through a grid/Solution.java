class Solution {
    
    public boolean check(List<List<Integer>> mat, int row, int col, int health, int best[][]){
        if(row>=mat.size() || row<0 || col>=mat.get(0).size() ||col<0){
            return false;
        }
        if(health <= best[row][col]){
            return false;
        }
        best[row][col] = health;
        


        if(mat.get(row).get(col)==1) health-=1;
        
        if(health<=0){
            return false;
        }
        if(row==mat.size()-1 && col==mat.get(0).size()-1){
            return true;
        }

        
        boolean left= check(mat, row, col-1, health, best);
        boolean right= check(mat, row, col+1, health, best);
        boolean up= check(mat, row-1, col, health, best);
        boolean down= check(mat, row+1, col, health, best);
     

        return left || right || up ||down;
    }
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {

        int best[][] = new int[grid.size()][grid.get(0).size()];
        return check(grid, 0, 0, health, best);

    }
}