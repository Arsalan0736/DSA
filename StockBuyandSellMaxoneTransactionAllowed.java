class StockBuyandSellMaxoneTransactionAllowed{
    public int maxProfit(int[] prices){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int price:prices){
            if(price<minPrice){
                minPrice=price;
            }else{
                int profit=price-minPrice;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int[] prices={7, 10, 1, 3, 6, 9, 2};
        StockBuyandSellMaxoneTransactionAllowed s=new StockBuyandSellMaxoneTransactionAllowed();
        int result=s.maxProfit(prices);
        System.out.print(result);
    }
}