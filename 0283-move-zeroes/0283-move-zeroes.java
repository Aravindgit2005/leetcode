class Solution {
    public void moveZeroes(int[] n) {
        int j=-1;
        for(int i=0;i<n.length;i++){
            if(n[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1;i<n.length;i++){
            if(n[i]!=0){
            int t=n[i];
            n[i]=n[j];
            n[j]=t;
            j++;
            }
        }
        
    }
}