package Revision;

public class kadanes {
    public static int kadaness(int[] arr ){
        int currentSum =0;
        int max = Integer.MIN_VALUE;


        for(int i=0;i<arr.length; i++){
            currentSum=currentSum+ arr[i];
            if(arr[i]<0){
                currentSum =0;
            }
            max = Math.max(currentSum, max);

        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1,2,-3,-2,5};
        System.out.println(kadaness(array));

        int[] arr = {-1,-2,-3,-4};
        System.out.println(kadaness(arr));
    }
}
