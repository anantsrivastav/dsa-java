package twoDarray;

public class diagonalmatrix {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sum=0;


        // primary matrix
//        for(int i=0; i<matrix.length; i++){
//            for(int j=0; j<matrix[0].length;j++){
//                if(i==j){
//                  sum+= matrix[i][j];
//                } else if (i+j== matrix.length-1) {
//                    sum+= matrix[i][j];
//                }
//            }
//        }

        //secondary matrix
//        for(int i=0; i<matrix.length; i++){
//            for(int j=matrix[0].length-1; j>=0; j-- ){
//                sum+= matrix[i][j];
//            }
//        }

        //optimizedapproach

        for(int i=0; i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!= matrix.length-1-i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        System.out.println("sum is "+sum);
    }

}
