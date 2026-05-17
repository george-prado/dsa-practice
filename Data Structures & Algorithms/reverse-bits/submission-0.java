class Solution {
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public int reverseBits(int n) {
        int res = 0;

        for (int i = 0; i < 32; i++) {
            int bit = (n >> i) & 1;
            res |= (bit << (31 - i));
        }

        return res;
    }
}
