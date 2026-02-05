class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        if(n<4){
            return false;
        }
        int i=0;
        int c=0,c1=0,c2=0;
        while(i<n-1 && nums[i]<nums[i+1]){
            c++;
            i++;
        }
        while(i<n-1 && nums[i]>nums[i+1]){
            c1++;
            i++;
        }
         while(i<n-1 && nums[i]<nums[i+1]){
            c2++;
            i++;
         }
         if(c>=1 && c1>=1 && c2>=1 && i==n-1){
            return true;
         }
         return false;
    }
}