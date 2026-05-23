class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int maxArea(int[] heights) {
        int res = 0;

        int leftBar = 0, rightBar = heights.length - 1;

        while (leftBar <= rightBar) {
            int h = Math.min(heights[leftBar], heights[rightBar]);
            int base = rightBar - leftBar;

            int area = base * h;
            res = Math.max(res, area);

            if (heights[leftBar] < heights[rightBar]) {
                leftBar++;
            } else {
                rightBar--;
            }
        }

        return res;
    }
}
