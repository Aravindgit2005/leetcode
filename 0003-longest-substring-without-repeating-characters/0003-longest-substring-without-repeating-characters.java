class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st=new HashSet<>();
        int i=0;
        int maxlen=0;
        for(int j=0;j<s.length();j++){
            while(st.contains(s.charAt(j))){
                st.remove(s.charAt(i));
                i++;
            }
            st.add(s.charAt(j));
            maxlen=Math.max(maxlen,j-i+1);
        }
        return maxlen;
    }
}