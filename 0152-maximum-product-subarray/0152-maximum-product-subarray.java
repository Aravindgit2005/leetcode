class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int f=1;
        int b=1;
        for(int i=0;i<nums.length;i++){
            if(f==0)f=1;
            if(b==0)b=1;
            f*=nums[i];
            int j=nums.length-i-1;
            b*=nums[j];
            max=Math.max(f,Math.max(b,max));
        }
        return max;
    }
}