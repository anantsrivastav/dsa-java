package ARRAYS;

public class prefix {

    public static void maxSubarraySum(int[] number){
        int CurrSum=0;
        int MaxSum = Integer.MIN_VALUE;

        int[] prefix = new int[number.length];

        prefix[0]= number[0];

        for(int i=1;i<prefix.length; i++){
            prefix[i] = prefix[i-1]+ number[i];
        }

        for(int i=0; i<number.length; i++){
            int start = i;

            for(int j=0;j<number.length; j++){
                int end  = j;

                CurrSum= start==0? prefix[end]: prefix[end]- prefix[start-1];

                if(MaxSum<CurrSum){
                    MaxSum = CurrSum;
                }
            }
        }
        System.out.println("The Max Sum is "+ MaxSum);
    }

    public static void main(String[] args) {
        int [] array = {2,4,-1, 3,4};

        maxSubarraySum(array);
    }



}
