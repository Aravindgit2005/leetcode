class Solution {
    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        for(int i=1;i<binary.length();i++){
            char a=binary.charAt(i);
            char b=binary.charAt(i-1);
            if(a==b){
                return false;
            }


        }
        return true;
    }
}