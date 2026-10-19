class Solution {
    // Time Complexity: O(n)
    // Time Complexity: O(n)
    hasDuplicate(nums) {
        const unique = new Set();

        for (const num of nums) {
            if (unique.has(num)) {
                return true;
            }

            unique.add(num);
        }

        return false;
    }
}