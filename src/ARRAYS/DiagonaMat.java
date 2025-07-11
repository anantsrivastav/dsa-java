package ARRAYS;

public class DiagonaMat {
    public static int DiagonalMatrix(int[][] matrix){
        int Primarysum=0;
        int SecondarySum=0;
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length;  j++){
                if(i==j){
                  Primarysum = Primarysum + matrix[i][j];
                } else if (i+j== matrix.length-1) {
                    SecondarySum = SecondarySum+ matrix[i][j];
                }
            }
        }

        return Primarysum+SecondarySum;
    }
    public static int OptimisedCode(int[][] matrix){
        int sum=0;
        for(int i=0 ;i<matrix.length; i++){
            //pd
            sum += matrix[i][i];

            //sd
            if(i != matrix.length-1-i){
                sum+= matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(DiagonalMatrix(matrix));
        System.out.println(OptimisedCode(matrix));
    }
}
