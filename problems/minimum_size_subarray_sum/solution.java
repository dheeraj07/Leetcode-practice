class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        int startIndex = 0;
        int runningTotal = 0;
        int minLength = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length; i++)
        {
            runningTotal += nums[i];
            while(runningTotal >= target)
            {
                minLength = Math.min(minLength, i+1-startIndex);
                runningTotal -= nums[startIndex++];
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}