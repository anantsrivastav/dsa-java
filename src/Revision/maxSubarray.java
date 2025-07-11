package Revision;

public class maxSubarray {
    public static int SubarraySum(int[] nums){
        int currentSum=0;
        int max = Integer.MIN_VALUE;

        for(int i=0 ;i<nums.length;i++){
            currentSum = currentSum + nums[i];

            if(nums[i]<0){
                currentSum =0;
            }
            else{
                max = Math.max(currentSum , max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-3,-4,6,1};
        System.out.println(SubarraySum(arr));
    }
}
