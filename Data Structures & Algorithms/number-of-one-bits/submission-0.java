class Solution {
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public int hammingWeight(int n) {
        int res = 0;

        while (n != 0) {
            // Brian Kernighan's Algorithm
            n = n & (n - 1);
            res++;
        }

        return res;
    }
}
