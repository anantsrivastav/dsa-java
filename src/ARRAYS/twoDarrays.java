package ARRAYS;

import java.util.Scanner;

public class twoDarrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j=0 ;j<columns; j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        System.out.println("The entered matrix is: ");
        for(int i=0; i<rows; i++){
            for(int j=0 ;j<columns; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
