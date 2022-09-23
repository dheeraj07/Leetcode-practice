class Solution {
    public int removeDuplicates(int[] nums) {
        
        
        int pointerX = 1;
        
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] != nums[pointerX-1])
            {
                nums[pointerX++] = nums[i];
            }
        }
        return pointerX;
    }
}