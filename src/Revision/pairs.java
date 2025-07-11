package Revision;

public class pairs {
    public static void subarray(int[] array){
        for(int i=0; i<array.length; i++){
            int start=i;
            for(int j=i;j<array.length;j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(array[k]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,5,7,8};
        subarray(array);

    }
}
