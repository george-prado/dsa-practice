class Solution {
    // Time Complexity: O(n + m)
    // Space Complexity: O(1)
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] letters = new char[26];

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i) - 'a']--;
        }

        for (int freq : letters) {
            if (freq != 0) {
                return false;
            }
        }

        return true;
    }
}
