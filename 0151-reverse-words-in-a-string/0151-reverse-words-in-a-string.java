class Solution {
    public String reverseWords(String s) {
        // Step 1: remove leading & trailing spaces
        s = s.trim();

        // Step 2: split by one or more spaces
        String[] arr = s.split("\\s+");

        // Step 3 & 4: reverse the array
        int i = 0, j = arr.length - 1;
        while (i < j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // Step 5 & 6: convert to string with space after each word
        StringBuilder sb = new StringBuilder();
        for (String word : arr) {
            sb.append(word).append(" ");
        }

        // remove last extra space
        return sb.toString().trim();
    }
}
