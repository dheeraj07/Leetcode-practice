class Solution {
    public int search(int[] nums, int target) {
        
        if(nums.length == 1)
        {
            return target == nums[0] ? 0 : -1;
        }
        
        int start = 0, end = nums.length - 1, mid;
        
        while(start <= end)
        {
            mid = start + (end - start)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(target < nums[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid+1;
            }
        }
        
        return -1;
        
    }
}