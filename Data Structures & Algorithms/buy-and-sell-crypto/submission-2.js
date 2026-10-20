class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    maxProfit(prices) {
        let maxProfit = 0, minPrice = Infinity;

        for (const price of prices) {
            if (price < minPrice) {
                minPrice = price;
                continue;
            }

            const currentProfit = price - minPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }
}
