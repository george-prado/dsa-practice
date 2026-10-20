class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    reverseList(head) {
        let prev = null, curr = head;

        while (curr != null) {
            const temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
