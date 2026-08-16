class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<=heights.length; i++){
            int currentHeight;
            if (i == heights.length) {
                currentHeight = 0;
            } 
            else {
                currentHeight = heights[i];
            }

            while(!stack.isEmpty() && currentHeight < heights[stack.peek()]){
                int height = heights[stack.pop()];
            
            int width;

                if (stack.isEmpty()) {
                    width = i;
                } 
                else {
                    width = i - stack.peek() - 1;
                }
                maxArea = Math.max(maxArea, height * width);
            }
                if (i < heights.length) {
                    stack.push(i);
                }
            
        }

          return maxArea;
    }
}
