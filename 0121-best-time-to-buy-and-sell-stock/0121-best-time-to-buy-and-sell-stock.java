class Solution {
    public int maxProfit(int[] arr) {
        int p=0;
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int c=arr[i]-min;
            p=Math.max(p,c);
            min=Math.min(min,arr[i]);
        }
        return p;
    }
}