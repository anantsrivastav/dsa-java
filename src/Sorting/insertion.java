package Sorting;

import java.util.Arrays;

public class insertion {
    public static void insertion(int[] arr){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev]>current){
                arr[prev+1] = arr[prev];
                prev--;  //finding best position
            }

            //insertion

            arr[prev+1]=current;

        }
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,3,2};

        insertion(arr);

        printArray(arr);
    }
}
