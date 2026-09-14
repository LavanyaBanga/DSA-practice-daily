class Solution {

    public List<Integer> grayCode(int n) {
        int total = 1 << n;
        List<Integer> ans = new ArrayList<>(total);
        for (int i = 0; i < total; i++) {
            int gray = i ^ (i >> 1);
            ans.add(gray);
        }
        return ans;
    }
}