import java.lang.Math;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowStart = 0;
        int runningTotal = 0;
        
        for(int i = 0; i < k; i++)
        {
            runningTotal += nums[i];
        }
        int sum = runningTotal;
        for(int i = k; i<nums.length; i++)
        {
            runningTotal += nums[i] - nums[windowStart++];
            sum = Math.max(runningTotal, sum);
        }
        return sum/(double)k;
    }
}