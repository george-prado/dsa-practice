class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // Gauss Formula
        int expected = n * (n + 1) / 2;

        for (int num : nums) {
            expected -= num;
        }

        return expected;
    }
}
