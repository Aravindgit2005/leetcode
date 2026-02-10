class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character>m1=new HashMap<>();
       HashMap<Character,Character>m2=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char k=s.charAt(i);
        char j=t.charAt(i);
        if(m1.containsKey(k) && m1.get(k)!=j || m2.containsKey(j) && m2.get(j)!=k){
            return false;
        }
        m1.put(k,j);
        m2.put(j,k);
       }
       return true;

    }
}