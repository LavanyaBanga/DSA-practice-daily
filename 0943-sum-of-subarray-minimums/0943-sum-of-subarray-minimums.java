class Solution {
    
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int MOD = (int)1e9 + 7;

        int[] NSL = getNSL(arr, n);  
        int[] NSR = getNSR(arr, n);  

        long sum = 0;
        
        for (int i = 0; i < n; i++) {
            long left = i - NSL[i];
            long right = NSR[i] - i;
            long totalWays = left * right;

            long totalSum = (arr[i] * totalWays) % MOD;
            sum = (sum + totalSum) % MOD;
        }

        return (int) sum;
    }

    private int[] getNSL(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return result;
    }

    private int[] getNSR(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        return result;
    }
}
