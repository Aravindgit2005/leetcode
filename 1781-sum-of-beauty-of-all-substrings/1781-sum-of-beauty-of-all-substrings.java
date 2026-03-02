class Solution {
    public int beautySum(String s) {

        int n = s.length();
        int result = 0;

        // first loop -> starting index
        for (int i = 0; i < n; i++) {

            // frequency array for characters
            int[] freq = new int[26];

            // second loop -> ending index
            for (int j = i; j < n; j++) {

                // add current character to frequency
                freq[s.charAt(j) - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;

                // find max and min frequency
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }

                // add beauty
                result += (max - min);
            }
        }

        return result;
    }
}