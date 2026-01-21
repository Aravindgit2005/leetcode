class Solution {
    void rA(int[] nums,int start,int end){
        while(start<end){
        int t=nums[start];
        nums[start]=nums[end];
        nums[end]=t;
        start++;
        end--;
    }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==0||k==0){
            return;
        }
        k=k%n;
        rA(nums,0,n-1);
        rA(nums,0,k-1);
        rA(nums,k,n-1);

        
    }
}
