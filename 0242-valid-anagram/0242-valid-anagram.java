class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>h1=new HashMap<>();
        HashMap<Character,Integer>h2=new HashMap<>();
        if(s.length()!=t.length())return false;
        for(char i:s.toCharArray()){
            h1.put(i,h1.getOrDefault(i,0)+1);
        }
          for(char i:t.toCharArray()){
            h2.put(i,h2.getOrDefault(i,0)+1);
        }
        return h1.equals(h2);

    }
}