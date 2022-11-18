import java.util.*;
public class MaxProfitBuySellStock{
   public static int maxProfit(int[] stockPrices) {
      
      // your code will replace this placeholder return statement
      int minprice = Integer.MAX_VALUE;
      int maxprofit = 0;

      if(stockPrices.length > 0) {
         for(int end = 0; end < stockPrices.length; end++) {
            if(stockPrices[end] < minprice) {
               minprice  = stockPrices[end];
            } else if(maxprofit < stockPrices[end] - minprice) {
               maxprofit = stockPrices[end] - minprice;
            }
         }
      }

      return maxprofit;
   }
}