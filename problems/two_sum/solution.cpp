class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        multimap<int,int> mp;
        vector<int> ans;
        for(int i=0;i<nums.size();i++){
            mp.insert(pair<int,int>(nums[i],i));
        }
        multimap<int,int>::iterator it = mp.begin();
        for(it;it!=mp.end();it++){
            int req = target-it->first;
            int first_index = it->second;
            mp.erase(it);
            auto k = mp.find(req);
            if(k!=mp.end()){
                ans.push_back(first_index);
                ans.push_back(k->second);
                break;
            }
        }
        return ans;
    }
};