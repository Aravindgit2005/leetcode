class Solution {
    public int majorityElement(int[] nums) {
        int e=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                e=nums[i];
                c++;
            }
            else if(e==nums[i]){
                c++;
            }
            else if(e!=nums[i]){
                c--;
            }
        }
        return e;
    }
}