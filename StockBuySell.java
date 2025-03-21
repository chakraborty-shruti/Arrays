//Given an array prices[] of size n denoting the cost of stock on each day, the task is to find the maximum total profit if we can buy and sell the stocks any number of times.

/*Input: prices[] = {100, 180, 260, 310, 40, 535, 695}
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655
Maximum Profit  = 210 + 655 = 865 */

class Test{

    static int maximumProfit(int[] prices){
        int res = 0;

        //Keep on adding the difference between adjacent prices
        for(int i = 1; i< prices.length; i++){
            if(prices[i] > prices[i -1]) 
            res += prices[i] - prices[i -1];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695 };
        System.out.println(maximumProfit(prices));
    }
}