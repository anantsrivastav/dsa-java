package Revision;

public class reversearray {
    public static void swap(int[] array){
        int first =0;
        int last = array.length-1;

        while(first<last){
            int temp =array[first];
            array[first]= array[last];
            array[last] = temp;

            first++;
            last--;
        }
    }
}
