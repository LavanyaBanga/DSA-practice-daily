class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(String s, int idx, List<String> path, List<List<String>> res) {
        // ✅ Base case: poori string use ho gayi
        if (idx == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }

        // ✅ Try all partitions starting from idx
        for (int i = idx; i < s.length(); i++) {
            // s[idx...i]
            if (isPalindrome(s, idx, i)) {
                path.add(s.substring(idx, i + 1));     // choose
                backtrack(s, i + 1, path, res);         // explore
                path.remove(path.size() - 1);           // un-choose (backtrack)
            }
        }
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
