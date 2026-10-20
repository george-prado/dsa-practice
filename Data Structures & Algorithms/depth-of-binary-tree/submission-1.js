class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(h)
    maxDepth(root) {
        if (!root) return 0;

        const left = this.maxDepth(root.left);
        const right = this.maxDepth(root.right);

        return 1 + Math.max(left, right);
    }
}
