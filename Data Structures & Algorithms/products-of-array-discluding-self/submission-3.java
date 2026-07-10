class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zerocount = 0;

        for (int num : nums) {
            if (num != 0) {
                prod = prod * num;
            } else {
                zerocount++;
            }
        }

        if (zerocount > 1) {
            return new int[nums.length];
        }

        if (zerocount > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    nums[i] = prod;
                } else {
                    nums[i] = 0;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = prod / nums[i];
            }
        }
        return nums;
    }
}
