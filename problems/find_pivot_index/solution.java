class Solution {
    public int pivotIndex(int[] nums) {
       int totalSum = 0, runningSum = 0;
        
        for(Integer i: nums)
        {
            totalSum += i;
        }
        
        
        for(int i = 0; i < nums.length; i++)
        {
            if(totalSum - runningSum - nums[i] == runningSum)
            {
                return i;
            } 
            runningSum += nums[i];
        }
        return -1;
    }
}