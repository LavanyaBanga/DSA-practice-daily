class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int n = s.length();
        int k = p.length();
        if (k > n) {
            return res;
        }

        // p ka frequency count
        int[] pCount = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }


        // s ki har window check karenge
        for (int i = 0; i <= n - k; i++) {

            int[] sCount = new int[26];

            // Current window ka frequency count
            for (int j = i; j < i + k; j++) {
                sCount[s.charAt(j) - 'a']++;
            }
            if (Arrays.equals(pCount, sCount)) {
                res.add(i);
            }
        }

        return res;
    }
}