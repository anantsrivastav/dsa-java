package Leetcode;

public class lc54 {
    public static void spiralOrder(int[][] matrix){
        int endRow= matrix.length-1;
        int endCol = matrix[0].length-1;
        int startRow=0;
        int startCol=0;


        while(startRow<=endRow && startCol<=endCol){
            for(int j=startCol ; j<=endCol; j++){
                System.out.print(matrix[startRow][j]); // top boundary
            }
            // right boundary

            for(int i=startRow+1; i<=endRow;i++){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][endCol]);
            }

            //bottom

            if(startRow<endRow) {

                for (int j = endCol - 1; j >= 0; j--) {

                    System.out.print(matrix[endRow][j]);
                }

            }
            //left boundary

            if(startCol<endCol) {
                for (int i = endRow - 1; i > startRow; i++) {
                    if (startCol == endCol) {
                        break;
                    }
                    System.out.print(matrix[i][startCol]);
                }
            }


            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }




    }

    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(matrix);
    }
}
