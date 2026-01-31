class Solution {
    public boolean isPalindrome(String s) {
      s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String[] arr = s.split("");

        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            if(!arr[i].equals(arr[j])){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
        