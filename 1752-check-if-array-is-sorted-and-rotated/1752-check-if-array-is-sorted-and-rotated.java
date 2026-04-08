class Solution {
    
    public static void rev(int[] nums, int i, int j) {
        while (i < j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
    }

    public boolean check(int[] nums) {
        int ind = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                ind = i;
                break;
            }
        }

        if (ind == -1) return true;

        rev(nums, 0, ind - 1);
        rev(nums, ind, nums.length - 1);
        rev(nums, 0, nums.length - 1);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }

        return true;
    }
}