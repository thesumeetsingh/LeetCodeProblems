class Solution {


    public boolean check(int row, int col, char[][] board, String word, int idx, boolean visited[][]){
        if(row>=board.length || row<0 || col>=board[0].length ||col<0){
            return false;
        }
        if(visited[row][col]){
            return false;
        }



        if(idx==word.length()-1){
            if(board[row][col]==word.charAt(idx)){
                visited[row][col]=true;
                return true;
            }
            return false;
        }

        if(board[row][col]==word.charAt(idx)){
            visited[row][col]=true;
            boolean left=check(row, col-1, board, word, idx+1, visited);
            boolean right=check(row, col+1, board, word, idx+1, visited);
            boolean up=check(row-1, col, board, word, idx+1, visited);
            boolean down=check(row+1, col, board, word, idx+1, visited);

            visited[row][col]=false;
            return left||right||up||down;
        }
        return false;
    }
    public boolean exist(char[][] board, String word) {
        

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                boolean visited[][]= new boolean[board.length][board[0].length];
                if(check(i,j,board, word, 0, visited)){
                    return true;
                }
            }
        }
        return false;
    }
}