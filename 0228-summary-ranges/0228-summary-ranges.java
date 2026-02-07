class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if (nums.length == 0) return ans;

        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);

        for (int num : nums) {

            // start of range:
            // if num is MIN_VALUE, it can't have a valid num-1 in int range
            boolean isStart = (num == Integer.MIN_VALUE) || !set.contains(num - 1);
            if (!isStart) continue;

            int start = num;
            int end = num;

            // expand, prevent MAX overflow
            while (end != Integer.MAX_VALUE && set.contains(end + 1)) {
                end++;
            }

            if (start == end) ans.add(String.valueOf(start));
            else ans.add(start + "->" + end);
        }

        return ans;
    }
}
