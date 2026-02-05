public class BuySell {
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        int minPrice  = Integer.MAX_VALUE; // sabse bada value
         int maxProfit =0;
         for(int i =0 ; i<prices.length; i++){
            if(prices[i]< minPrice){ // 1<7
                minPrice = prices[i];

            }else{
                int profit = prices[i] -minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }

         }
         System.out.println(maxProfit);
    }
}
//output: 5
//explaination--
//i	arr[i]	minPrice	maxProfit
//0	7	7	0
//1	1	1	0
//2	5	1	4
//3	3	1	4
//4	6	1	5
//5	4	1	5
