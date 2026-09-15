class Solution {
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public int maxPalindromes(String s, int k) {
        int n = s.length();
        int count = 0;
        int lastEnd = 0;

        for (int right = k - 1; right < n; right++) {
            int left = right - k + 1;

            boolean add =
                (left >= lastEnd && isPalindrome(s, left, right)) ||
                (left > lastEnd && isPalindrome(s, left - 1, right));

            if (add) {
                count++;
                lastEnd = right + 1;
            }
        }

        return count;
    }
}