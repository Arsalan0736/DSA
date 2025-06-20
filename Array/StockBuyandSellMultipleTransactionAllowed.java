class StockBuyandSellMultipleTransactionAllowed{
    public int maximumProfit(int prices[]){
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args){
        int prices[]={100, 180, 260, 310, 40, 535, 695};
        StockBuyandSellMultipleTransactionAllowed c=new StockBuyandSellMultipleTransactionAllowed();
        int result = c.maximumProfit(prices);
        System.out.print(result);
    }
}

