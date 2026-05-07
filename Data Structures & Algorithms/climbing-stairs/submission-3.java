class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int climbStairs(int n) {
        int one = 1, two = 1;

        for (int i = 0; i < n - 1; i++) {
            int temp = one;
            one += two;
            two = temp;
        }

        return one;
    }
}
