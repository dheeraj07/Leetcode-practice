import java.util.Arrays;
import java.lang.Math;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int index = end;
        int[] result = new int[nums.length];
        
        while(start <= end)
        {
            int left = nums[start] * nums[start];
            int right = nums[end] * nums[end];
            if(left <= right)
            {
                result[index--] = right;
                end--;
            }
            else
            {
                result[index--] = left;
                start++;
            }   
        }
        return result;
    }
}