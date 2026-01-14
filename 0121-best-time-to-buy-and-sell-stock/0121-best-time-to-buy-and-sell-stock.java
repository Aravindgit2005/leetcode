class Solution {
    public int maxProfit(int[] arr) {
        int min =arr[0];
        int profit=0;
        for (int i=1;i<arr.length;i++){
            int c=arr[i]-min;
            profit=Math.max(profit,c);
            min=Math.min(min,arr[i]);

        }
        return profit;
    }
}