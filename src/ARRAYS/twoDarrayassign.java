package ARRAYS;

public class twoDarrayassign {
//    public static int Search(int[][] matrix ,int key){
//        int count=0;
//
//        for(int i=0 ;i< matrix.length; i++){
//            for(int j=0;j<matrix.length; j++){
//                if(matrix[i][j]==key){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
    public static int Sum(int[][] matrix ) {
        int sum = 0;
        int row =1;

        for(int i = 1; i<=1;i++ ){
            for(int j=0; j<matrix[0].length; j++){
                sum = sum+ matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},{3,7,9}, {1,7,7}};
//        System.out.println(Search(matrix,7));
        System.out.println(Sum(matrix));
    }
}
