class Solution {
    public boolean search(int[] mat,int x){
        int low=0,high=mat.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mat[mid]==x){
                return true;
            }
            else if(mat[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int target) {
        for(int i=0;i<mat.length;i++){
             if(search(mat[i], target)){
                return true;    
            }
        }

        return false;   
    }
}