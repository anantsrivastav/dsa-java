package BackTracking;

public class Bt {
    public static void ChangeArr(int[] arr, int i, int val){
        if(i==arr.length){
            PrintArr(arr);
            return;
        };

        arr[i] = val;
        ChangeArr(arr, i+1, val+1);
        arr[i] = arr[i]-2;


    }
    public static void PrintArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        ChangeArr(arr,0,1);
        PrintArr(arr);
    }
}
