package ARRAYS;

public class subarray {

    public static void Minimum(int[] number){
        int min = Integer.MAX_VALUE;


        for(int i =0 ;i<number.length; i++){
            if(number[i]<min){
                min = number[i];
            }
        }
        System.out.println("The minimum is: "+ min);
    }


    public static void Subarray(int[] numbers){
        int n = numbers.length;
        int ts =0;
        int currentSum =0;


        for(int i=0;i<n;i++){
            int start = i;

            for(int j=i;j<n;j++){
                int end = j;
                for(int k = start; k<=end ; k++){
                    System.out.print(numbers[k]+ " ");
                    currentSum = currentSum+ numbers[k];
                }

                ts++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println(currentSum);
        System.out.println(ts);
        Minimum(numbers);
    }

    public static void main(String[] args) {

        int[] numbers = { 1 , 2,3,4};

        Subarray(numbers);
    }
}
