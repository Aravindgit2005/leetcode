class Solution {
    public int search(int[] nums, int x) {
     int low=0;
     int high=nums.length-1;
     while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]==x){
            return mid;
        }
else if(nums[low] <= nums[mid]){
            if(nums[low]<=x && nums[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        else{
            if(nums[mid]<x && nums[high]>=x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
     }
     return -1;
    }
}