class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>have=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(have.containsKey(nums[i])){
                int sub=Math.abs(have.get(nums[i])-i);
                if(sub<=k){
                    return true;
                }
            }
            have.put(nums[i],i);
        }
        return false;
    }
}