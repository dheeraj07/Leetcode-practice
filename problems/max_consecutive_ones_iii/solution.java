class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxRange = 0, startRange = 0, noOfZeroes = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0) 
            {
                noOfZeroes++;
            }
            while(noOfZeroes > k)
            {
                if(nums[startRange] == 0) noOfZeroes--;
                startRange++;
            }
            
        maxRange = Math.max(maxRange, i - startRange + 1);   
        }
        return maxRange;
}
}