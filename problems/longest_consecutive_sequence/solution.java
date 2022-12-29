class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        
        for(int num: nums)
        {
            st.add(num);
        }
        
        int maxConseuctiveSoFar = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(!st.contains(nums[i] - 1))
            {
                int tempTrack = 1, currMax = 1;
                while(st.contains(nums[i] + tempTrack))
                {
                   currMax++; tempTrack++;
                }
                maxConseuctiveSoFar = Math.max(maxConseuctiveSoFar, currMax);
            }
        }
        return maxConseuctiveSoFar;
    }
}