class Solution {
    public int[] plusOne(int[] dig) {
        int n = dig.length;

     
        for (int i = n - 1; i >= 0; i--) {
            if (dig[i] < 9) {
                dig[i]++; 
                return dig; 
            }

           
            dig[i] = 0;
        }

        int[] res = new int[n + 1];
        res[0] = 1; 
        return res;
    }
}
