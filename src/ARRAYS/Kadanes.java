package ARRAYS;

public class Kadanes {
    public static void kadane(int[] numbers){
        int currentSum=0;
        int maxSum= Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){

            currentSum = currentSum + numbers[i];

            if(currentSum<0){
                currentSum = 0;
            } else if (currentSum>maxSum) {
                maxSum = currentSum;
            }


        }



        System.out.println("Max subarray sum is "+ maxSum);
    }

    public static void main(String[] args) {

        int[] array = {1,3,4,6,7,8,-2,-3,-2};

        int[] arr = {-1,-2,-3};

        kadane(arr);
    }
}
