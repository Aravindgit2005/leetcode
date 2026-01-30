class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> st= new HashSet<>();
        int i=0;
        int max=0;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            while(st.contains(nums[j])){
                st.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
            st.add(nums[j]);
            sum+=nums[j];
            max=Math.max(max,sum);
        }
        return max;
        
    }
}