class Solution {
    public boolean isPalindrome(String s) {
                // Step 1: Remove spaces and commas
      s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        // Step 3: Split letter by letter
        String[] arr = s.split("");

        // Step 4: Two-pointer check
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
        