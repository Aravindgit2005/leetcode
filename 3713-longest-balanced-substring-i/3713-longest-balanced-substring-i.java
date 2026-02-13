class Solution {
    public int longestBalanced(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                char x=s.charAt(j);
                freq[x-'a']++;
                if(isfreqsame(freq)){
                    max=Math.max(max,j-i+1);
                }
            }
            
        }
        return max;
    }
    public static boolean isfreqsame(int[] freq){
        int value=0;
        for(int i=0;i<26;i++){
            if(freq[i]==0)continue;

            if(value==0){
                value=freq[i];
            }
            else if(value!=freq[i]){
                return false;
            }
        }
        return true;
    }

}