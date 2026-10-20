class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    climbStairs(n) {
        let one = 1, two = 1;

        for (let i = 0; i < n - 1; i++) {
            let temp = one;
            one += two;
            two = temp;
        }

        return one;
    }
}
