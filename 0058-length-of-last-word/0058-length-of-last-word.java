class Solution {
    public int lengthOfLastWord(String s) {
        String[] word=s.split(" ");
        String lw=word[word.length-1];
        int l=lw.length();
        return l;
    }
}