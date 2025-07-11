package ARRAYS;

public class buildingques {
    public static int trapped(int[] height){
        int n = height.length;
        int trappedWater = 0;
        int waterlevel = 0;

        // leftmax
        int[] leftMax = new int[n];
        leftMax[0] = height[0];

        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //rightmax
        int[] rightMax = new int[n];
        rightMax[n-1]= height[n-1];

        for(int i=n-2; i>=0; i--){
            rightMax[i]= Math.max(height[i], rightMax[i+1] );
        }

        // waterlevel

        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i] );
            trappedWater = trappedWater+ waterLevel - height[i];
        }

       return trappedWater;
    }

    public static void main(String[] args) {
        int[] arr ={ 5, 3,1,4,8};
        System.out.println(trapped(arr));
    }
}
