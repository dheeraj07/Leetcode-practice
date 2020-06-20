class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        int maxy = *max_element(candies.begin(),candies.end());
        vector<bool> ans;
        for(unsigned long i = 0;i<candies.size();i++)
        {
            if(candies[i]+extraCandies >= maxy)
            {
                ans.emplace_back(true);
            }
            else ans.emplace_back(false);
        }
        return ans;
    }
};