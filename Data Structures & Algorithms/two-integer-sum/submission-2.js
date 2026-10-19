class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    twoSum(nums, target) {
        const mappedNums = new Map();

        for (let i = 0; i < nums.length; i++) {
            const currentNum = nums[i];
            const diff = target - currentNum;

            if (mappedNums.has(diff)) {
                return [mappedNums.get(diff), i];
            }

            mappedNums.set(currentNum, i);
        }

        return [];
    }
}
