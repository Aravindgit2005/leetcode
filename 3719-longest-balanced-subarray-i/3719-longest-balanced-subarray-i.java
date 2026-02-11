import java.util.*;

class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int l = 0; l < n; l++) {
            HashSet<Integer> evenSet = new HashSet<>();
            HashSet<Integer> oddSet = new HashSet<>();

            for (int r = l; r < n; r++) {
                int x = nums[r];
                if ((x & 1) == 0) evenSet.add(x);
                else oddSet.add(x);

                if (evenSet.size() == oddSet.size()) {
                    ans = Math.max(ans, r - l + 1);
                }
            }
        }

        return ans;
    }
}
