class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if (ans.isEmpty() || ans.get(ans.size() - 1) != nums1[i]) {
                    ans.add(nums1[i]);
                }
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        int[] res=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            res[k]=ans.get(k);
        }
        return res;
    }
}

