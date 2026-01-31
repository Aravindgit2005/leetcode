class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> prefixsumcount=new HashMap<>();
        int count=0;
        int prefixsum=0;
                prefixsumcount.put(0, 1);   
        for(int i=0;i<n;i++){
         prefixsum+=nums[i];
         int rem=prefixsum-k;
         if(prefixsumcount.containsKey(rem)){
            count+=prefixsumcount.get(rem);
         }   
  prefixsumcount.put(prefixsum, 
                prefixsumcount.getOrDefault(prefixsum, 0) + 1);        }
        return count;
    }
}