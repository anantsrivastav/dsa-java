package Revision;

public class pairss {
    public static void pairs(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length; j++){
                System.out.print("("+nums[i]+","+ nums[j]+")");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        pairs(arr);
    }
}
