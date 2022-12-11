class Solution {
    public int deleteGreatestValue(int[][] grid) {
        
        
         for(int i = 0; i < grid.length; i++)
        {
            Arrays.sort(grid[i]);
        }
        
        int maxEle, running_sum = 0, rows = 1;
        
        while(rows <= grid[0].length)
        {
            maxEle = 0;
            for(int i = 0; i < grid.length; i++)
            {
                maxEle = Math.max(maxEle, grid[i][grid[i].length-rows]);  
            }
            running_sum += maxEle;
            ++rows;
        }
        
        System.out.println(running_sum);
        
        return running_sum;
        
        }
}