class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Stack stack = new Stack();

        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for (char bracket : s.toCharArray()) {
            if (map.containsKey(bracket)) {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char expectedCloseBracket = map.get(stack.peek());
                if (expectedCloseBracket == bracket) {
                    stack.pop();
                    continue;
                }

                return false;
            }
        }

        return stack.isEmpty();
    }
}
