import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        
        for(int i = 0; i < nums.length; i++)
        {
            int requiredNumber = target - nums[i];
            if(hm.containsKey(requiredNumber))
            {
                result[0] = hm.get(Integer.valueOf(requiredNumber));
                result[1] = i;
                return result;
            }
            hm.put(nums[i], i);
        }
        
        return result;
    }
}