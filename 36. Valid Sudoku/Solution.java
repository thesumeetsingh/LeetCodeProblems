class Solution {

    public static boolean isSafe(char[][] board,int row ,int col,char digit){

        //row and col
        for(int i=0;i<9;i++){
            if(i==col){
                continue;
            }
            if(board[row][i]==digit){
            System.out.println("matched at: "+board[row][i]+"   row:"+(row)+" col:"+(i));
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(i==row){
                continue;
            }
            if(board[i][col]==digit){
                System.out.println("matched at: "+board[i][col]+"   row:"+(i)+" col:"+(col));
                return false;
            }
        }
        int sRow=(row/3)*3;
        int sCol=(col/3)*3;
        for(int i=sRow;i<sRow+3;i++){
            for(int j=sCol;j<sCol+3;j++){
                if(board[i][j]==digit){
                    if(i==row && j==col){
                        continue;
                    }else{
                        System.out.println("matched at: "+board[i][j]+"   row:"+(i)+" col:"+(j));
                        return false;
                    }
                }
            }

        }
        
        return true;
        
    }


    public boolean isValidSudoku(char[][] board) {


        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.'){
                    continue;
                }
                if(isSafe(board, row, col, board[row][col])){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}