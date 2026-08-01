class Solution {
       public int[] distributeCandies(int candies, int n) {
        int[] res = new int[n];
        for (int i = 0; candies > 0; ++i) {
            res[i % n] += Math.min(candies, i + 1);
            candies -= i + 1;
        }
        return res;
    }
}