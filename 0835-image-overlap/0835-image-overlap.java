class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        List<int[]> ones1 = new ArrayList<>();
        List<int[]> ones2 = new ArrayList<>();
        for (int r = 0; r < img1.length ; r++) {
            for (int c = 0; c < img1.length ; c++) {
                if (img1[r][c] == 1) ones1.add(new int[]{r, c});
                if (img2[r][c] == 1) ones2.add(new int[]{r, c});
            }
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int[] p1 : ones1) {
            for (int[] p2 : ones2) {
                int key = (p1[0] - p2[0])*100 + (p1[1] - p2[1]);
                map.put(key, map.getOrDefault(key,0)+1);
                ans = Math.max(ans, map.get(key));
            }
        }
        return ans;
    }
}