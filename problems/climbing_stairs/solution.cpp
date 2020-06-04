class Solution {
public:
    
    vector<int> totalSteps;
    int getTotalSteps(int n)
    {
        if (n == 0 || n == 1) return 1;
        
        if(totalSteps[n] != 0)
        {
            return totalSteps[n];
        }
        
        totalSteps[n] = getTotalSteps(n-1)+getTotalSteps(n-2);
        return totalSteps[n];
    }
    
    int climbStairs(int n) {
    
        totalSteps.resize(n+1,0);
        return getTotalSteps(n);
       /* vector<long long> v(n+1);
        v[0] = v[1] = 1;
        for(int i = 2;i < v.size(); i++)
        {
            v[i] += v[i-1]+v[i-2];
        }
        return v[v.size()-1]; */       
    }
};