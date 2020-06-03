class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minimumNo = INT_MAX,profit = 0;
        for(int i = 0;i < prices.size(); i++)
        {
            if(minimumNo > prices[i])
            {
                minimumNo = prices[i];
            }
            
            if( profit < (prices[i] - minimumNo))
            {
                profit = prices[i] - minimumNo;    
            }   
        }
        
        return profit;      
        
    }
};