package ARRAYS;

public class stocks {
    public static int BuySellStocks(int[] price){
        int buyPrice = Integer.MAX_VALUE;
        int Maxprofit = 0;

        for(int i=0;i<price.length; i++){
            if(buyPrice< price[i]){
                int profit = price[i] - buyPrice;
                Maxprofit = Math.max(profit, Maxprofit );
            }
            else {
                buyPrice = price[i]; // because price is low so good time to buy stock..........
            }
        }
        return Maxprofit;
    }

    public static void main(String[] args) {
        int[] price = {2,3,6,4,8};
        System.out.println(BuySellStocks(price));
    }
}
