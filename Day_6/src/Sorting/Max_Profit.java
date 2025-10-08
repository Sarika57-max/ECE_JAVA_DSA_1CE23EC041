package Sorting;


public class Max_Profit {
	public static int buyAndSellStock(int [] prices)
	{
		int buyPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for (int i = 0 ; i< prices.length; i ++)
		{
			if(buyPrice < prices[i])
			{
				int profit = prices[i] - buyPrice;
				maxProfit = Math.max(maxProfit, profit);
				
			}
			else
			{
				 buyPrice = prices[i];
				
			}
			
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		int [] prices = {17,18
				,5,3,6,4};
		int max = buyAndSellStock(prices);
		System.out.println("The maximum profit obtained is" +max);
		
	}
			
	
		
	}


