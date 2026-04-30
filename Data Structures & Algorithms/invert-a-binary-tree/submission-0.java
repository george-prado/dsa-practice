class Solution {
    // Time Complexity: O(n) <- visit each node once
    // Space Complexity: O(h) <- recursion stack height (log n if balanced, n otherwise)
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
