class Solution {
    public int[] applyOperations(int[] n) {
        for(int i=1;i<n.length;i++){
            if(n[i]==n[i-1]){
                n[i-1]*=2;
                n[i]*=0;
            }
        }
           int j=-1;
        for(int i=0;i<n.length;i++){
            if(n[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return n;
        }
        for(int i=j+1;i<n.length;i++){
            if(n[i]!=0){
                int t=n[i];
                n[i]=n[j];
                n[j]=t;
                j++;
            }
        }
        return n;
    }
}