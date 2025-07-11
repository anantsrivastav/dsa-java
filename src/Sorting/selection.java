package Sorting;

import java.util.Arrays;

public class selection {
    public static void selectionSort(int[] arr){

        int n= arr.length;

        for(int i=0 ;i<n-1;i++){
            int minPos = i;

            for(int j=i+1; j<n; j++){
                if(arr[minPos]>arr[j]){
                    minPos =j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] array = {4,5,1,3,2};
        int n = array.length;

        selectionSort(array);



    }
}
