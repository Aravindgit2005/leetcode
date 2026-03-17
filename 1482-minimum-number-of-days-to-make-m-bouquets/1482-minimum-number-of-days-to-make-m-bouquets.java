class Solution {
    public boolean Possible(int[] arr, int i, int m, int k) {
        int noofb = 0;
        int cnt = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] <= i) {
                cnt++;
            } else {
                noofb += (cnt / k);
                cnt = 0;
            }
        }

        noofb += (cnt / k);

        return noofb >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        long required = (long) m * k;
        if (required > bloomDay.length) return -1;

        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        for (int bloom : bloomDay) {
            minDay = Math.min(minDay, bloom);
            maxDay = Math.max(maxDay, bloom);
        }

        int low = minDay, high = maxDay, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (Possible(bloomDay, mid, m, k)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }
}
