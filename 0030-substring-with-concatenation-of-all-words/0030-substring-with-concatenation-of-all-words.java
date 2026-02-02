import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        if (s == null || words == null || words.length == 0) return ans;

        int k = words.length;
        int l = words[0].length();
        int n = s.length();
        int t = k * l;
        if (n < t) return ans;

        HashMap<String, Integer> need = new HashMap<>();
        for (String w : words) {
            need.put(w, need.getOrDefault(w, 0) + 1);
        }

        for (int i = 0; i < l; i++) {
            HashMap<String, Integer> window = new HashMap<>();
            int left = i;
            int count = 0;

            for (int right = i; right + l <= n; right += l) {
                String w = s.substring(right, right + l);

                if (need.containsKey(w)) {
                    window.put(w, window.getOrDefault(w, 0) + 1);
                    count++;

                    while (window.get(w) > need.get(w)) {
                        String leftWord = s.substring(left, left + l);
                        window.put(leftWord, window.get(leftWord) - 1);
                        left += l;
                        count--;
                    }

                    if (count == k) {
                        ans.add(left);

                        String leftWord = s.substring(left, left + l);
                        window.put(leftWord, window.get(leftWord) - 1);
                        left += l;
                        count--;
                    }
                } else {
                    window.clear();
                    count = 0;
                    left = right + l;
                }
            }
        }

        return ans;
    }
}
