class Solution {
    public int beautySum(String s) {
        int totalBeauty = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];  // for 'a' to 'z'

            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                freq[c - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;

                for (int f : freq) {
                    if (f > 0) {
                        max = Math.max(max, f);
                        min = Math.min(min, f);
                    }
                }

                totalBeauty += (max - min);
            }
        }

        return totalBeauty;
    }
}
