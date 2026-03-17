class Solution {
    public int sump(int[] nums,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/mid);
        }
        return sum;

    }
    public int smallestDivisor(int[] nums, int threshold) {
        if(nums.length>threshold)return -1;
        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(sump(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;   
    }
}