class Solution {
    public int findKthPositive(int[] arr, int k) {
        int m = 0;
        int st = 1;
        int index = 0;
        while(true){
            if (index<arr.length && arr[index]==st) index++;
            else {
                m++;
                if (m == k) {
                    return st;
                }
            }
            st++;
        }
    }
}