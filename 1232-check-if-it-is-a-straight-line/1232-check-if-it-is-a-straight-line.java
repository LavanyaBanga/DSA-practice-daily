class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        int xDiff = coordinates[1][0] - coordinates[0][0];
        int yDiff = coordinates[1][1] - coordinates[0][1];

        int n = coordinates.length;

        for (int i = 2; i < n; i++) {

            int x = coordinates[i][0] - coordinates[0][0];
            int y = coordinates[i][1] - coordinates[0][1];

            if (yDiff * x != y * xDiff) {
                return false;
            }
        }

        return true;
    }
}