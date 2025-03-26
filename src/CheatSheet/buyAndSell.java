package CheatSheet;

public class buyAndSell {
    public static int maxProfit(int []prices){
        int mini=prices[0];
        int max_profit=0;
        for(int i=0;i<prices.length;i++){
            int cost=prices[i]-mini;
            max_profit=Math.max(max_profit,cost);
            mini=Math.min(mini,prices[i]);
        }
        return max_profit;
    }
    public static void main(String[]args){
      int prices[]={7,1,5,3,6,4};
      //  int prices[]={7,6,4,3,1};
        int value=maxProfit(prices);
        System.out.println(value);
    }
}
