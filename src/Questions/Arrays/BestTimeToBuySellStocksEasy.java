package Questions.Arrays;

public class BestTimeToBuySellStocksEasy {
    public static void main(String[] args) {
        int prices[] = { 2,1,2,1,0,1,2 };
        maxProfit(prices);
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
             return 0;
         }
         
         int minPrice = prices[0];
         int maxProfit = 0;
         
         for (int i = 1; i < prices.length; i++) {
             int price = prices[i];
             System.out.println(price );
             if (price < minPrice) {
                 minPrice = price;
             } else if (price - minPrice > maxProfit) {
                 maxProfit = price - minPrice;
             }
         }
         System.out.println("max profit = "+maxProfit);
         return maxProfit;
        
    }
}