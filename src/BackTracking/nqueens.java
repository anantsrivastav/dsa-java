package BackTracking;

public class nqueens {

    public static boolean isSafe(int row, int col, char[][] board){
        // vertical

        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        // left diagonal

        for(int i= row-1, j= col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        // rightdiagonal

        for(int i= row-1, j=col+1; i>=0&& j<board.length; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static void NQueens(char[][] board, int row){

        // base condition
        if(row== board.length){
            printBoard(board);
            return;
        }
        for(int j=0 ;j< board.length; j++){

            if(isSafe(row,j,board)) {
                board[row][j] = 'Q';
                NQueens(board, row + 1);
                board[row][j] = '*';
            }
        }


    }
    public static void printBoard(char[][] board){
        System.out.println("--------------------");
        for(int i=0; i<board.length;i++){
            for(int j=0 ; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n= 4;
        char[][] board = new char[n][n];

        // initialisation

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length;j++){
                board[i][j]='*';
            }
        }
        NQueens(board, 0);
    }
}
