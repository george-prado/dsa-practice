class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    isPalindrome(s) {
        let left = 0, right = s.length - 1;

        while (left < right) {
            const leftChar = s.charAt(left), rightChar = s.charAt(right);

           if (!this.isLetterOrDigit(leftChar)) {
                left++;
                continue;
           }

           if (!this.isLetterOrDigit(rightChar)) {
                right--;
                continue;
           }

           if (leftChar.toLowerCase() !== rightChar.toLowerCase()) {
            return false;
           }

           left++;
           right--;
       }

       return true;
    }

    isLetterOrDigit(input) {
        const lowerCaseInput = input.toLowerCase();

        const isLetter = lowerCaseInput >= 'a' && lowerCaseInput <= 'z';
        const isDigit = lowerCaseInput >= '0' && lowerCaseInput <= '9';

        return isLetter || isDigit;
    }
}
