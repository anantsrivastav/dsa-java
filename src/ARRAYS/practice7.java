package ARRAYS;

public class practice7 {

    public static boolean Check(int[] arr){
        int n = arr.length;

        for(int i=0 ; i< n; i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] number = {2,4,6,8,5,2};

        System.out.println(Check(number));
    }
}
