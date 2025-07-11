package DivideAndConquer;

public class dac {

    public static void printArray(int[] arr){
        for(int i=0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void MergeSort(int[] arr, int si, int ei){

        if(si>=ei){
            return;
        }

        int mid = si + (ei-si)/2;

        MergeSort(arr, si, mid);   //left part
        MergeSort(arr, mid+1, ei);   // right part
        Merge(arr, si, mid, ei);
    }

    public static void Merge(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei-si+1];

        int i = si;
        int j= mid+1;
        int k = 0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k++]= arr[i++];
        }
        while(j<=ei){
            temp[k++]= arr[j++];
        }

        for( k=0 , i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,6,9,5,4,0};
        MergeSort(arr,0,6);
        printArray(arr);
    }
}
