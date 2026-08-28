class Solution {
    public static boolean isSafe(char[][] board, int row, int col, int digit){
        //check row and col
        for(int i=0;i<9;i++){
            if(board[i][col]==digit){
                return false;
            }
            if(board[row][i]==digit){
                return false;
            }
        }

        //check grid
        int sRow=(row/3)*3;
        int sCol=(col/3)*3;

        for(int i=0;i<3;i++){
            if(board[sRow][sCol+i]==digit){
                return false;
            }else if(board[sRow+1][sCol+i]==digit){
                return false;
            }else if(board[sRow+2][sCol+i]==digit){
                return false;
            }
        }
        return true;
    }
    public static boolean sudokuSolver(char[][] board, int row, int col){
        if(row==9){
            return true;
        }

        int nextRow=row, nextCol=col+1;
        if(nextCol==9){
            nextRow++;
            nextCol=0;
        }

        if(board[row][col]!='.'){
            return sudokuSolver(board, nextRow, nextCol);
        }

        for(char digit='1';digit<='9';digit++){
            if(isSafe(board, row, col, digit)){
                board[row][col]=digit;
                if(sudokuSolver(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        sudokuSolver(board, 0,0);
    }
}