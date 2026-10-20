class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    isValid(s) {
        if (s.length % 2 !== 0) return false;
        
        const stack = [];
        const mappedBrackets = { ')': '(', ']': '[', '}': '{' };

        for (const ch of s) {
            if (ch in mappedBrackets) {
                if (stack.pop() !== mappedBrackets[ch]) return false;
            } else {
                stack.push(ch);
            }
        }

        return stack.length === 0;
    }
}
