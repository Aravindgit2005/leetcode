class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int x1=0;
       for(int i=0;i<=n;i++){
        x1^=i;
       }
       int x2=0;
       for(int i:nums){
        x2^=i;
       }
       return x1^x2;
    }
}