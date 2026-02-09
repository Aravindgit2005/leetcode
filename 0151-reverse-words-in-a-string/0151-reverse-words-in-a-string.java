class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr=s.split("\\s+");
        int i=0,j=arr.length-1;
        while(i<j){
            String t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        StringBuilder ans=new StringBuilder();
        for(String k:arr){
            ans.append(k).append(" ");
        }
        return ans.toString().trim();
    }
}