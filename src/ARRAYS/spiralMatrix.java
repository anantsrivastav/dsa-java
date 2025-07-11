package ARRAYS;

public class spiralMatrix {
    public static void SpiralMat(int[][] array){
        int start_row =0;
        int start_col = 0;
        int end_row = array.length-1;
        int end_col= array[0].length-1;

        while(start_row<=end_row && start_col <=end_col){
            // top boundary

            for(int j=start_col; j<=end_col; j++){
                System.out.print(array[start_row][j]+ " ");
            }

            // right boundary

            for(int i=start_row+1; i<=end_row; i++){
                if(start_row==end_row){
                    break;
                }
                System.out.print(array[i][end_col]+ " ");
            }

            //bottom boundary

            for(int j=end_col-1; j>=start_col; j--){
                if(start_col==end_col){
                    break;
                }
                System.out.print(array[end_row][j]+ " ");
            }

            //left boundary

            for(int i=end_row-1; i>=start_row+1; i--){
                if(start_col==end_col){
                    break;
                }
                System.out.print(array[i][start_col]+" ");
            }

            start_row++;
            start_col++;
            end_col--;
            end_row--;
        }

    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4}, {4,5,6,7}, {8,9,0,1}, {1,2,3,4}};

        SpiralMat(matrix);


    }
}
