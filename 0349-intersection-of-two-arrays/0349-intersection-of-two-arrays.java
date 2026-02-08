class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>st=new HashSet<>();
         HashSet<Integer> ans=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            st.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(st.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }
      int[] res = new int[ans.size()];
        int index = 0;
        for (int num : ans) {
            res[index++] = num;
        }

        return res;
    }
}///also do in two pointer try that also

