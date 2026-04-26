class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) return true;
        }

        return false;
    }
}