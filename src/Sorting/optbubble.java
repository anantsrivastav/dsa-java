package Sorting;

public class optbubble {
    public static void bubbleSort(int[] arr){
        boolean swapped = false;

        for(int turns=0; turns<arr.length-1; turns++){
            for(int j=0; j<arr.length-1-turns; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }
    public static void PrintArray(int[] arr){
        for(int i=0 ;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,7,6};
        bubbleSort(arr);
        PrintArray(arr);
    }
}
