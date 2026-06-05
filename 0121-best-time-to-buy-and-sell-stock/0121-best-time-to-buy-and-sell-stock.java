class Solution {
    public int maxProfit(int[] arr) {
        int min=arr[0];
        int profit=0;
        int ans=0;
        for(int i=1;i<arr.length;i++){
            profit=arr[i]-min;
            ans=Math.max(ans,profit);
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return ans;
    }
}