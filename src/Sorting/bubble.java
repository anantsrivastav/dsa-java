package Sorting;

import java.util.Arrays;

public class bubble {

    public static void main(String[] args) {

        int[] array = {4,5,1,3,2};
        int n = array.length;

        for(int turns=0 ; turns<n-1; turns++){
            for(int j=0; j<n-1-turns; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
