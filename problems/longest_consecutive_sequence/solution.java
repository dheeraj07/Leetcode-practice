class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0)
        {
            return 0;
        }
        else if(nums.length == 1)
        {
            return 1;
        }
        
        Arrays.sort(nums);
        int longestSoFar = 0, longestSeq = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] == nums[i-1])
            {
                continue;
            }
            if(nums[i] - nums[i-1] != 1)
            {
               longestSoFar = Math.max(longestSoFar,longestSeq);
                longestSeq = 0;
                continue;
            }
            longestSeq++;
        }
        return Math.max(longestSoFar,longestSeq)+1;
    }
}