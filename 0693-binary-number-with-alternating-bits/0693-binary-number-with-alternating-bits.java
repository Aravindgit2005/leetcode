class Solution {
    public boolean hasAlternatingBits(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n/=2;

        }
        String binary=sb.reverse().toString();
        //String binary = Integer.toBinaryString(n);
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