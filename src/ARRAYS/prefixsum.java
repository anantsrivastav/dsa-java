package ARRAYS;

public class prefixsum {

    public static void MaxSum(int[] arr){
        int n = arr.length;
        int Max = Integer.MIN_VALUE;
        int sum=0;

        for(int i=0; i<n ;i++){
            sum = sum + arr[i];

            if(sum>Max){
                Max = sum;
            }
        }
    }

    public static void main(String[] args) {

    }
}
