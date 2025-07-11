package ARRAYS;

public class repetition {
    public static boolean repeat(int[] array){
        int n = array.length;

        for(int i=0; i< n; i++){
            for(int j = i+1 ;j<n ;j++){
                if(array[i]==array[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,2};
        int[] array_2 = {1,2,3,4,5,6};

        System.out.println(repeat(array));
        System.out.println(repeat(array_2));
    }
}
