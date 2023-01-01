class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1, currMaxArea = Integer.MIN_VALUE;
        
        while(start < end)
        {
            int area = (end - start) * Math.min(height[start], height[end]);
            currMaxArea = Math.max(area, currMaxArea);
            if(height[start] < height[end])
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return currMaxArea;
    }
}