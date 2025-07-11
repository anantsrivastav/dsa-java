package ARRAYS;

public class assignment1 {
//    public static int Search(int[] array, int target){
//        int n = array.length;
//
//        for(int i = 0; i<n ;i++){
//            if(array[i] == target){
//                return i;
//            }
//        }
//        return -1;
//    }

    public static int BuySellStocks(int[] price){
        int n = price.length;
        int BuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i =0; i<n  ;i++){
            if(BuyPrice<price[i]){
                int profit = price[i] - BuyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
            else{
                BuyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        System.out.println(BuySellStocks(array));
    }

}
