package Revision;

public class prefixSum {
    public static void prefix(int[] arr){
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        int CurrentSum=0;

        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+ arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i; j<arr.length;j++){
                int end = j;
                if(start==0){
                    CurrentSum = prefix[end];
                }
                else {
                    CurrentSum = prefix[end] - prefix[start - 1];
                }

            }
        }
    }
}
