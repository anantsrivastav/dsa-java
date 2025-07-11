package twoDarray;

import java.util.Scanner;

public class firstprogram {

    public static void search(int[][] matrices, int key){
        int n = matrices.length;
        int m= matrices[0].length;
        for(int i=0;i<n; i++){
            for(int j=0 ;j<m;j++){
                if(matrices[i][j]==key){
                    System.out.println("the element is found at index "+i+ ","+j );
                }
            }
        }
    }
    public static void main(String[] args) {

        int[][] matrices = new int[3][3];

        Scanner sc = new Scanner(System.in);
        int n = matrices.length;
        int m = matrices[0].length;

        System.out.println("Enter the matrix");;

        for(int i=0;i<n; i++){
            for(int j=0;j<m;j++){
                matrices[i][j]= sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrices[i][j]+" ");
            }
            System.out.println();
        }

       search(matrices,5);
    }


}
