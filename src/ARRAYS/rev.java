package ARRAYS;

public class rev {

    public static void Reverse(int[] arr){

        int first=0, last= arr.length-1;

        while(first<last){
            int temp= arr[first];
            arr[first] = arr[last];
            arr[last]= temp;

            first++;
            last--;
        }


    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        Reverse(array);

        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();

    }
}
