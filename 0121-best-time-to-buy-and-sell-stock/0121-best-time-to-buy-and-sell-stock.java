class Solution {
    public int maxProfit(int[] arr) {
        int min=arr[0];
        int p=0;
        for(int i=1;i<arr.length;i++){
            int c=arr[i]-min;
            p=Math.max(c,p);
            min=Math.min(arr[i],min);
        }
        return p;
    }
}