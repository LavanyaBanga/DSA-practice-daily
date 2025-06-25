 class Solution {
    public int trap(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int water = 0;
        stack.push(0);
        int max = Integer.MAX_VALUE;
        for(int i=1; i<heights.length; i++){
            while(!stack.isEmpty() && heights[stack.peek()] < heights[i]){
                int n = stack.pop();
                if(stack.empty()) break;
                int dis = i - stack.peek() - 1;
                int height = Math.min(heights[i], heights[stack.peek()]) - heights[n];
                 if(height > 0)
                     water += dis * height;
             }
            stack.push(i);
         }
         return water;
     }
 }