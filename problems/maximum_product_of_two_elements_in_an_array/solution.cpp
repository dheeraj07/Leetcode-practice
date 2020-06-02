class Solution {
public:
    int maxProduct(vector<int>& nums) {
        long max_1 = nums[0], max_2 = INT_MIN,max_index = 0;
            for ( int i = 1; i < nums.size(); i++)
            {

                if(max_1 < nums[i])
                {
                    if(max_2 < max_1) max_2 = max_1;
                  max_1 = nums[i];  
                    max_index = i;
                }
                
                if(max_1 >= nums[i] && max_2 < nums[i] && max_index < i)
                {
                    max_2 = nums[i];
                }
            }
        return (max_1-1)*(max_2-1);    
        }
};