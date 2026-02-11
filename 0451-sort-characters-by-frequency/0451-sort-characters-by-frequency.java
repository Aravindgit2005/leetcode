class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,0);
            }
            map.put(c,map.get(c)+1);
        }
        PriorityQueue<Character>q=new PriorityQueue<>((a,b)->(map.get(b)-map.get(a)));
        for(char key:map.keySet()){
            q.add(key);
        }
        StringBuilder sb=new StringBuilder();
        while(q.size()>0){
            char t=q.poll();
            for(int i=0;i<map.get(t);i++){
                sb.append(t);
            }
        }
        return sb.toString();
    }
}