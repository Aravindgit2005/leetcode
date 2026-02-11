import java.util.*;

class Solution {
    public int longestBalanced(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
                    Set<Integer>st=new HashSet<>();

            int even=0;
            int odd=0;
            for(int j=i;j<nums.length;j++){
                int x=nums[j];
                if(!st.contains(x)){
                    if(x%2==0)even++;
                    else odd++;
                    st.add(x);
                }
                if(even==odd){
                    ans=Math.max(ans,j-i+1);
                }
            }
         
        }
           return ans;
}
}
