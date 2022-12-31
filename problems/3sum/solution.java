class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> trip = new ArrayList<>();
        
        
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++)
        {
            if(i == 0 || nums[i] != nums[i-1])
            {
                Set<Integer> st = new HashSet<>();
                for(int j = i+1; j < nums.length; j++)
                {
                    int diff = -nums[i] - nums[j];
                    if(st.contains(diff))
                    {
                        trip.add(Arrays.asList(nums[i], nums[j], diff));
                        while( j+1 < nums.length && nums[j] == nums[j+1])
                        {
                            j++;
                        }
                    }
                    else
                    {
                        st.add(nums[j]);
                    }
                }
            }
        }
      return trip;  
    }
}