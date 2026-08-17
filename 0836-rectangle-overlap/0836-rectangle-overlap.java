class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        long x_min = Math.max(rec1[0] , rec2[0]);
        long y_min = Math.max(rec1[1] , rec2[1]);
        long x_max = Math.min(rec1[2] , rec2[2]);
        long y_max = Math.min(rec1[3] , rec2[3]);

        long x = x_max - x_min;
        long y = y_max - y_min;

        long area = x * y;

        if(area > 0 && x > 0 && y > 0){
            return true;
        }
        return false;
    }
}