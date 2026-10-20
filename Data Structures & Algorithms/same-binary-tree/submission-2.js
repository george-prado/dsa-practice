class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(h)
    isSameTree(p, q) {
        if (!p && !q) return true;
        if (!p || !q) return false;

        if (p.val === q.val) {
            return  this.isSameTree(p.left, q.left) 
            && this.isSameTree(p.right, q.right);
        }

        return false;
    }
}
