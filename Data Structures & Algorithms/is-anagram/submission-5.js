class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    isAnagram(s, t) {
        if (s.length !== t.length) return false;

        const letters = new Array(26).fill(0);

        for (let i = 0; i < s.length; i++) {
            const sLetterPosition = s.charCodeAt(i) - 97; // 97 = 'a'
            const tLetterPosition = t.charCodeAt(i) - 97; // 97 = 'a'

            letters[sLetterPosition]++;
            letters[tLetterPosition]--;
        }

        for (const letter of letters) {
            if (letter !== 0) return false;
        }

        return true;
    }
}
