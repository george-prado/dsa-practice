class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean canAttendMeetings(List<Interval> intervals) {
        for (int i = 1; i < intervals.size(); i++) {
            Interval past = intervals.get(i - 1);
            Interval current = intervals.get(i);
            if (past.end > current.start && past.start < current.end) {
                return false;
            }
        }

        return true;
    }
}
