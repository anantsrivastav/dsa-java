package twoDarray;

public class spiralmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {2, 3, 4, 6},
                {4, 7, 9, 3},
                {1, 7, 8, 9}
        };

        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // Top row
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }

            // Right column
            for (int i = startrow + 1; i <= endrow; i++) {
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][endcol] + " ");
            }

            // Bottom row
            if (startrow < endrow) {
                for (int j = endcol - 1; j >= startcol; j--) {
                    System.out.print(matrix[endrow][j] + " ");
                }
            }

            // Left column
            if (startcol < endcol) {
                for (int i = endrow - 1; i > startrow; i--) {
                    System.out.print(matrix[i][startcol] + " ");
                }
            }

            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }
}
