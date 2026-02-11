class Solution {
    public int maxDepth(String s) {
        int p=0;
        int ans=0;
        for(char x:s.toCharArray()){
            if(x=='('){
                p+=1;
            }
            else if(x==')'){
                ans=Math.max(ans,p);
                p-=1;
            }
        }
        return ans;
    }
}