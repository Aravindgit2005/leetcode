class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(max>=i){
                if(nums[i]+i>=max){
                    max=nums[i]+i;
                }
            }
            else{
                break;
            }
        }
        if(max>=n-1){
            return true;
        }
        else{
            return false;
        }
    }
}