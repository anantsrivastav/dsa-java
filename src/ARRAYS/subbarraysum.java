package ARRAYS;

import java.util.Arrays;

public class subbarraysum {

    public static void MaxSubarray(int[] arr){
        int n = arr.length;
        int current =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int start = i;

            for(int j=i; j<n ;j++){

                current =0;
                int last = j;
                for(int k = start; k<=last; k++){
                    current = current + arr[k];

                    System.out.println(current);

                    if(current>maxSum){
                        maxSum = current;
                    }
                }
            }
        }
        System.out.println("Max arrays sum = "+ maxSum);
    }

    public static void main(String[] args) {

        int[] arr = {2,4,7,5,9};

        MaxSubarray(arr);

    }
}
