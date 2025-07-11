package Revision;

public class subarraysum {
    public static int subarray(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int currentSum=0;

        for(int i=0; i<nums.length; i++){

            for(int j=i+1; j<nums.length; j++){
                currentSum =0;
                System.out.print("("+nums[i]+","+nums[j]+")");
                currentSum= currentSum+ nums[i]+nums[j];
                if(currentSum>maxSum){
                    maxSum = currentSum;
                }

            }
            System.out.println();
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(subarray(array));
    }
}
