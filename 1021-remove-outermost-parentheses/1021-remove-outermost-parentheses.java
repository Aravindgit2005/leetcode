class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder st=new StringBuilder();
        int cnt=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                if(cnt>0)st.append(i);
                cnt++;
            }
            else{
                cnt--;
                if(cnt>0)st.append(i);
            }
        }
        return st.toString();
    }
}