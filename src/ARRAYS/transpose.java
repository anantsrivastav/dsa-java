package ARRAYS;

import java.util.Arrays;

public class transpose {
    public static void Swap(int[][]arr, int a, int b){
        int n= arr.length;
        while(n>=0){
            int temp = a;
            a =b;
            b =temp;
        }

    }

    public static int[][] transpose(int[][] matrix){
        for(int i= 0 ;i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(transpose(matrix));
    }
}
