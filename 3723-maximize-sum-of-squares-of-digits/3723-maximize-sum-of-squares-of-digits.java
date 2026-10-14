class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum == 0 || sum > 9 * num) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        while (sum > 0) {
            if (sum >= 9) {
                result.append('9');
                sum -= 9;
            } else {
                result.append((char) ('0' + sum));
                sum = 0;
            }
        }

        while (result.length() < num) {
            result.append('0');
        }

        return result.toString();
    }
}