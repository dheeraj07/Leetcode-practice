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
            if(Math.abs(nums[start]) >= Math.abs(nums[end]))
            {
                double squaredNum = nums[start];
                result[index] = (int) Math.pow(squaredNum, 2);
                start++;
            }
            else
            {
               double squaredNum = nums[end];
                result[index] = (int) Math.pow(squaredNum, 2);
                end--; 
            }
            index--;
        }
        
        return result;
    }
}