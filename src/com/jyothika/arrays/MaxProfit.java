// Given an array prices[] of non-negative integers, representing the prices of the stocks on different days, find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.
// Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
// Output: 8
// Explanation: Buy for price 1 and sell for price 9. 

// Input: prices[] = [7, 6, 4, 3, 1]
// Output: 0
// Explanation: Since the array is sorted in decreasing order, 0 profit can be made without making any transaction.

// Input: prices[] = [1, 3, 6, 9, 11]
// Output: 10
// Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and selling at price[n-1]
class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int buy, max_profit=0;
        buy = prices[0];
        for(int i=1; i<prices.length; i++) {
            // if we encounter any value less than buy, we update it since we need least value to buy the stock
            if(prices[i] < buy) {
                buy = prices[i];
            }
            // if prices is more then we calculate the max_profit in very iteration
            else if(prices[i] > buy ){
                max_profit = Math.max(max_profit, prices[i] - buy);
            }
        }
        return max_profit;
    }
}