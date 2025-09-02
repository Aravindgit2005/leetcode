class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minn=prices[0]
        profit=0
        for i in range(1,len(prices)):
            cost=prices[i]-minn
            profit=max(profit,cost)
            minn=min(minn,prices[i])
        return profit

        