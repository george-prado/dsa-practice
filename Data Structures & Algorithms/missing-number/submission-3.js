class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    missingNumber(nums) {
        let sum = nums.length * (nums.length + 1) / 2;

        for (const num of nums) {
           sum -= num; 
        }

        return sum;
    }
}
