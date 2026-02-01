class Solution {

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {
        int index = -1;

        // 1) find first decreasing element from right
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // if fully decreasing -> reverse whole array
        if (index == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // 2) find just larger element than nums[index] from right
        for (int i = nums.length - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // 3) reverse the suffix
        reverse(nums, index + 1, nums.length - 1);
    }
}
