class Solution {
    public int edgeScore(int[] arr) {
        long[] ans=new long[arr.length];
        for(int i=0;i<arr.length;i++){
              ans[arr[i]]+=i;
        }
        long max=-1;
        int a=-1;
        for(int i=0;i<arr.length;i++){
            if(ans[i]>max){
                max=ans[i];
                a=i;
            }
        }
        return a;
            }
}