class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] freq=new int[26];
        int[] freq1=new int[26];
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
            freq[s1.charAt(i)-'a']++;
            }
            else{
                freq1[s1.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<s2.length();i++){
            if(i%2==0){
            freq[s2.charAt(i)-'a']--;
            }
            else{
                freq1[s2.charAt(i)-'a']--;

            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0 || freq1[i]!=0){
                return false;
            }
        }
        return true;
    }
}