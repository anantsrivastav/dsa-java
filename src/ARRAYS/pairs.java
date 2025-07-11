package ARRAYS;

public class pairs {

    public static void pairs(int[] arr){
        int n= arr.length;

        for(int i=0 ; i< n; i++){
            for(int j = i + 1; j<n ; j++){
                System.out.print("( " + arr[i] + " , " + arr[j] + ")");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};

        pairs(number);
    }
}
