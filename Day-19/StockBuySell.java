class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        /*int maxProfit = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int profit = prices[j]-prices[i];
                if(profit>0){
                    maxProfit = Math.max(profit,maxProfit);
                }
                else{
                    continue;
                }
            }
        }
        return maxProfit;*/
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price: prices){
            if(price < minPrice){
                minPrice = price;
            }
            else{
                maxProfit = Math.max(maxProfit, price-minPrice);
            }
        }
        return maxProfit;
    }
}