package ARRAYS;

public class sortedMatrix {
//    public static boolean Search(int[][] matrix , int key){
//        int row = 0;
//        int col = matrix[0].length-1;
//
//        while(row< matrix.length&& col>=0){
//            if(matrix[row][col]==key){
//                System.out.println("Element found at index: "+"(" + row + "," + col + ")");
//                return true;
//            } else if (matrix[row][col]>key) {
//                col--;
//            } else if (matrix[row][col]<key) {
//                row++;
//            }
//        }
//        System.out.println("Element not found");
//        return false;
//    }
    public static boolean SearchMatrix(int[][] matrix, int key){
        int row = matrix.length-1;
        int col = matrix[0].length-1;

        while(row>=0 && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Element found at index: ("+row+","+col+")");
                return true;
            } else if (matrix[row][col]<key) {
                col++;
            } else if (matrix[row][col]>key) {
                row--;
            }
        }
        System.out.println("Element not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {{10,20,30,40}, {15,25,35,45}, {27,29,37,48}, {32,33,39,50}};
        System.out.println(SearchMatrix(mat,45));
    }
}
