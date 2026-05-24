class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(m)
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int res = 0;

        int l = 0, maxFreq = 0;
        for (int r = 0; r < s.length(); r++) {
            char right = s.charAt(r), left = s.charAt(l);

            freq.put(right, freq.getOrDefault(right, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(right));

            if ((r - l + 1) - maxFreq > k) {
                freq.put(left, freq.get(left) - 1);
                l++;
            }

            res = Math.max(maxFreq, r - l + 1);
        }

        return res;
    }
}
