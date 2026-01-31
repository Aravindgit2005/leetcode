class Solution {
    public static void ra(int[] nums,int s,int e){
        while(s<e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s++;
            e--;
        }

    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
         k=k%n;
        if(k==0||n==0){
            return ;
        }
        ra(nums,0,n-1);
        ra(nums,0,k-1);
        ra(nums,k,n-1);
    }
}
