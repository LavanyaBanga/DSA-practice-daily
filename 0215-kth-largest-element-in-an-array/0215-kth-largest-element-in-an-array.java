class Solution {
    public int findKthLargest(int[] nums, int k) {
        /* 1 2 3 4 5 6 7 8 9 10

          3 2 1 5 6 4 ,    k = 2
          heap = [3, 2]
          num = 1 -> num(1) < peak(2), skip it, heap = [3, 2]
          num = 5 -> num(5) > peak(2), add it, heap = [5, 3] 
          num = 6 -> num(6) > peak(3), add it, heap = [6, 5] 
          num = 4 -> num(4) < peak(5), skip it, heap = [6, 5] 
          return heap.peak();
        */

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
        return minHeap.peek();
    }
}