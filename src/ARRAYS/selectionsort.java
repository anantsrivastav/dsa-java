package ARRAYS;

import java.nio.channels.SelectionKey;

public class selectionsort {
    public static void selection(int[] array){


        for(int i=0; i<array.length-1; i++){
            int smallest =i;
            for(int j=i+1; j<array.length;j++){
                if(array[smallest]>  array[j]){
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;

        }
    }

    public static void insertionSort(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            int current = i;
            int previous =i-1;

            while(arr[previous]>arr[current] && previous>=0){
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = arr[current];
        }
    }
    public static void PrintArray(int[] arr){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};

        selection(array);
        PrintArray(array);
    }
}
